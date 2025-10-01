using Microsoft.AspNetCore.Mvc;
using System.ComponentModel.DataAnnotations;

namespace Krish_Gohel_Darshan_University.Models
{
    public class TBLSALARYMSTModel
    {
        [Key]
        public int? ID { get; set; }
        [Required(ErrorMessage = "Select Employee")]
        public int EMPID { get; set; }
        [Required(ErrorMessage = "Select Month")]
        public string MONTH { get; set; }

        [Required(ErrorMessage = "Feel Salary For Selected Month")]
        public double SALARY { get; set; }
        public string? EMPName { get; set; }
    }

    public class EMPDropDown
    {
        public int EMPID { get; set; }
        public string EMPName { get; set; }
    }
}
