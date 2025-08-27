using iTextSharp.text;
using iTextSharp.text.pdf;
using Krish_Gohel_Darshan_University.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Data.SqlClient;
using System.Data;
using System.Runtime.Intrinsics.Arm;

namespace Krish_Gohel_Darshan_University.Controllers
{
    public class TBLSALARYMSTController : Controller
    {
        private IConfiguration configuration;

        #region Connection_Configuration
        public TBLSALARYMSTController(IConfiguration configuration)
        {
            this.configuration = configuration;
        }
        #endregion

        #region GetData
        public DataTable getData(String SP,int? ID = 0)
        {
            using (SqlConnection conn = new SqlConnection(configuration.GetConnectionString("myConnection")))
            {
                conn.Open();

                using (SqlCommand cmd = conn.CreateCommand())
                {
                    cmd.CommandType = CommandType.StoredProcedure;
                    cmd.CommandText = SP;

                    if (ID != null && ID > 0)
                    {
                        cmd.Parameters.AddWithValue("ID", ID);
                    }

                    SqlDataReader reader = cmd.ExecuteReader();

                    DataTable dt = new DataTable();
                    dt.Load(reader);

                    return dt;
                }
            }
        }
        #endregion

        #region Salary_List
        public IActionResult SalaryList()
        {
            DataTable dt = getData("[PR_TBLSALARYMST_SelectAll_With_Join]");

            List<TBLSALARYMSTModel> salaryList = new List<TBLSALARYMSTModel>();

            foreach (DataRow x in dt.Rows) 
            {
                TBLSALARYMSTModel salaryModel = new TBLSALARYMSTModel();
                salaryModel.ID = Convert.ToInt32(x["ID"]);
                salaryModel.EMPName = x["NAME"].ToString();
                salaryModel.MONTH = x["MONTH"].ToString();
                salaryModel.SALARY = Convert.ToDouble(x["SALARY"]);
                salaryList.Add(salaryModel);
            }

            return View(salaryList);
        }
        #endregion

        #region Salary_Delete
        public ActionResult SalaryDelete(int ID)
        {
            try
            {
                if (ID > 0)
                {
                    using (SqlConnection conn = new SqlConnection(configuration.GetConnectionString("myConnection")))
                    {
                        conn.Open();

                        using (SqlCommand cmd = conn.CreateCommand())
                        {
                            cmd.CommandType = CommandType.StoredProcedure;
                            cmd.CommandText = "PR_TBLSALARYMST_Delete";

                            cmd.Parameters.AddWithValue("ID", ID);

                            int reflected = cmd.ExecuteNonQuery();

                            if (reflected > 0)
                            {
                                TempData["Message"] = "Salary Deleted Successfully.";
                            }

                        }
                    }
                }
                else
                {
                    TempData["Exception"] = "Invalid ID";
                }
            }
            catch (Exception ex) {
                TempData["Exception"] = ex.Message;
            }

            return RedirectToAction("SalaryList");
        }
        #endregion

        #region Employee_DropDown
        public List<EMPDropDown> getDropDown()
        {
            List<EMPDropDown> emplist = new List<EMPDropDown>();
            DataTable dt = getData("PR_EMP_DropDown");

            foreach (DataRow d in dt.Rows)
            {
                EMPDropDown emp = new EMPDropDown();
                emp.EMPID = Convert.ToInt32(d["ID"]);
                emp.EMPName = d["NAME"].ToString();
                emplist.Add(emp);
            }

            return emplist;
        }
        #endregion

        #region OpenFormPage
        public IActionResult FormPage(int? ID = 0)
        {
            List<EMPDropDown> emplist = getDropDown();
            ViewBag.EmpList = emplist;

            if(ID != null && ID > 0)
            {
                DataTable dt = getData("PR_TBLSALARYMST_SelectByID", ID);

                TBLSALARYMSTModel salarymodel = new TBLSALARYMSTModel();

                foreach(DataRow d in dt.Rows)
                {
                    salarymodel.ID = Convert.ToInt32(d["ID"]);
                    salarymodel.EMPID = Convert.ToInt32(d["EMPID"]);
                    salarymodel.MONTH = d["MONTH"].ToString();
                    salarymodel.SALARY = Convert.ToDouble(d["SALARY"]);
                }

                TempData["SalaryID"] = salarymodel.ID;

                return View(salarymodel);
            }
            return View(new TBLSALARYMSTModel());
        }
        #endregion

        #region Save_Form
        public ActionResult SaveForm(TBLSALARYMSTModel salarymodel)
        {
            try
            {
                if (ModelState.IsValid)
                {

                    using (SqlConnection conn = new SqlConnection(configuration.GetConnectionString("myConnection")))
                    {
                        conn.Open();

                        using (SqlCommand cmd = conn.CreateCommand())
                        {
                            cmd.CommandType = CommandType.StoredProcedure;
                            
                            // check Update or Insert
                            if(salarymodel.ID > 0)
                            {
                                cmd.CommandText = "PR_TBLSALARYMST_Update";
                                cmd.Parameters.AddWithValue("ID",salarymodel.ID);
                            }
                            else
                            {
                                cmd.CommandText = "PR_TBLSALARYMST_Insert";
                            }
                            cmd.Parameters.AddWithValue("EMPID", salarymodel.EMPID);
                            cmd.Parameters.AddWithValue("MONTH", salarymodel.MONTH);
                            cmd.Parameters.AddWithValue("SALARY", salarymodel.SALARY);

                            int reflected = cmd.ExecuteNonQuery();

                            if(reflected > 0)
                            {
                                TempData["Message"] = (salarymodel.ID > 0 ? "Update " : "Insert ") + "Salary Successfully."; 
                            }
                            else
                            {
                                TempData["Exception"] = "Operation Failed";
                                return View("FormPage", salarymodel);
                            }

                            return RedirectToAction("SalaryList");
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                TempData["Exception"] = ex.Message;
            }
            return View("FormPage", salarymodel);
        }
        #endregion

        #region Export Report
        public IActionResult GenerateReport()
        {
            DataTable dt = getData("PR_TBLSALARYMST_SelectAll");

            var document = new Document();
            using (var memoryStream = new MemoryStream())
            {
                PdfWriter.GetInstance(document, memoryStream);
                document.Open();

                var titleFont = FontFactory.GetFont(FontFactory.HELVETICA_BOLD, 18);
                document.Add(new Paragraph("Product List", titleFont));

                document.Add(new Paragraph(" "));

                var table = new PdfPTable(4);
                table.AddCell("ID");
                table.AddCell("EMPID");
                table.AddCell("MONTH");
                table.AddCell("SALARY");

                foreach (DataRow row in dt.Rows)
                {
                    table.AddCell(Convert.ToInt32(row["ID"]).ToString());
                    table.AddCell(Convert.ToInt32(row["EMPID"]).ToString());
                    table.AddCell(row["MONTH"].ToString());
                    table.AddCell(Convert.ToDouble(row["SALARY"]).ToString());
                }

                document.Add(table);

                document.Close();

                var bytes = memoryStream.ToArray();
                return File(bytes, "application/pdf", "SalaryReport.pdf");
            }
        }
        #endregion

        #region CancelMethod
        public IActionResult CancelOperation()
        {
            return RedirectToAction("SalaryList");
        }
        #endregion

        #region ClearMethod
        public IActionResult ClearOperation(int? ID = 0)
        {
            TBLSALARYMSTModel model = new TBLSALARYMSTModel();
            List<EMPDropDown> emplist = getDropDown();
            ViewBag.EmpList = emplist;

            if (ID != null && ID > 0)
            {
                model.ID = ID;

                return View("FormPage", model);
            }
            else
            {
                return View("FormPage", model);
            }
        }
        #endregion
    }
}
