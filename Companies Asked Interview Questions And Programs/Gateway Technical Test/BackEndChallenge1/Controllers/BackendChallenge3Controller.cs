using Microsoft.AspNetCore.Mvc;
using System.Net.Http.Json;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml;

namespace BackEndChallenges.Controllers
{
    public class BackendChallenge3Controller : Controller
    {
        public class BackendChallenge3Model
        {
            public UserModel user { get; set; }
            public string status { get; set; }
            public string lastLogin { get; set; }
        }

        public class UserModel
        {
            public string name { get; set; }
            public string email { get; set; }
            public ProfileModel profile { get; set; }
        }

        public class ProfileModel
        {
            public string age { get; set; }
            public string gender { get; set; }
            public string location { get; set; }
            public ContactModel contact { get; set; }
        }

        public class ContactModel
        {
            public string phone { get; set; }
            public string alternatePhone { get; set; }
            public string address { get; set; }
        }

        public IActionResult Index()
        {
            // Problem 3 is you have Web API Json Object first deserialize and then remove that properties that value is "N/A" or "" or "-" and then print the Json Object in to Console.

            string S = "{\"user\": {    \"name\": \"John Doe\",    \"email\": \"N/A\",    \"profile\": {      \"age\": \"-\",      \"gender\": \"\",      \"location\": \"New York\",      \"contact\": {        \"phone\": \"\",        \"alternatePhone\": \"N/A\",        \"address\": \"-\"      }    }  },  \"status\": \"active\",  \"lastLogin\": \"-\"}";

            BackendChallenge3Model model = JsonSerializer.Deserialize<BackendChallenge3Model>(S);

            CleanModel(model);

            var newS = JsonSerializer.Serialize(model,new JsonSerializerOptions {
                DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull 
            });

            //above serialization same doing in Newtons.Json like below

            //JsonConvert.SerializeObject(model, new JsonSerializerSettings
            //{
            //    NullValueHandling = NullValueHandling.Ignore,
            //    Formatting = Formatting.Indented
            //});

            Console.WriteLine(newS);

            return View();
        }

        private void CleanModel(BackendChallenge3Model model)
        {
            if (IsEmpty(model.lastLogin)) model.lastLogin = null;

            if(model.user != null)
            {
                if (IsEmpty(model.user.email)) model.user.email = null;

                if(model.user.profile != null)
                {
                    if (IsEmpty(model.user.profile.age)) model.user.profile.age = null;
                    if (IsEmpty(model.user.profile.gender)) model.user.profile.gender = null;
                    if (IsEmpty(model.user.profile.location)) model.user.profile.location = null;

                    if(model.user.profile.contact != null)
                    {
                        if (IsEmpty(model.user.profile.contact.phone)) model.user.profile.contact.phone = null;
                        if (IsEmpty(model.user.profile.contact.alternatePhone)) model.user.profile.contact.alternatePhone = null;
                        if (IsEmpty(model.user.profile.contact.address)) model.user.profile.contact.address = null;

                    }

                }
            }
        }

        private bool IsEmpty(string value)
        {
            return value == "N/A" || value == "-" || string.IsNullOrWhiteSpace(value);
        }
    }
}
