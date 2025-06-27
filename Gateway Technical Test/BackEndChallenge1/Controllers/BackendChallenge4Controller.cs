using System.Diagnostics;
using System.Text.Json;
using BackEndChallenges.Models;
using Microsoft.AspNetCore.Mvc;

namespace BackEndChallenges.Controllers
{
    public class BackendChallenge4Model
    {
        public string data { get; set; }
    }

    public class BackendChallenge4Controller : Controller
    {
        private readonly ILogger<BackendChallenge4Controller> _logger;

        public BackendChallenge4Controller(ILogger<BackendChallenge4Controller> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {

            // here given a web API it gives object and you want find the count of age==1 in the data. and you want to
            // Add that name and age property into new object into data and console the count how many age = 1
            // below is the solution of it

            String S = "{ \"data\": \"name=John, age=3, key=\\\"Ema\\\", age=1, name=\\\"Olivia\\\", age=2, name=Krish, age=1, name=\\\"Liam\\\", age=5, name=Zara, age=1, key='Noah', age=3, name='Ava', age=1, name=Mike, age=4, name='Ella', age=1, name=Alex, age=9, name='Ivy', age=1, name=\\\"Leo\\\", age=6, name=Rose, age=1, key='Sam', age=12, name='Nina', age=1, name='Tom', age=2, name='Rita', age=1, name=\\\"Eli\\\", age=7, name=Bea, age=1, key=\\\"Zed\\\", age=15, name='Joy', age=1, name=Dean, age=1, name='Hope', age=1, name=\\\"Iris\\\", age=4, name=Eve, age=2, name=\\\"Clay\\\", age=1, name='Joel', age=1, name='Mia', age=6, name='Finn', age=1, name='Lila', age=1, name='Seth', age=1, name='Tina', age=3, name=\\\"Alan\\\", age=1, key='Gina', age=2, name='Elle', age=1, name='Zoe', age=4, name='Liz', age=1, name='Tony', age=8, name='Jude', age=1, name='Reed', age=1, name='Bev', age=3, name='Saul', age=1, name='Dora', age=1, name='Nell', age=5, name='Niki', age=1, name='Max', age=9, name='Earl', age=1, name='Paul', age=6, name='Ben', age=2, name='Maia', age=1, name='Tommy', age=4, name='Rhea', age=1, name='Kyle', age=1, name='Ivan', age=3, name='Ruth', age=1, name='Faye', age=1, name='Rose', age=1, name='Owen', age=1, name='Anna', age=7, name='Eric', age=5, name='Amy', age=1, name='Nora', age=2, name='June', age=1, name='Troy', age=1, name='Zack', age=3, name='Leah', age=1, name='Luke', age=1, name='Ari', age=2, name='Mona', age=1, name='Gail', age=1, name='Nevaeh', age=1, name='Autumn', age=4, name='Skylar', age=1, name='Hazel', age=6, name='Clara', age=1, name='Jay', age=1, name='Aria', age=1, name='Tess', age=1, name='Sara', age=1, name='Andy', age=1, name='Willow', age=5, name='Caleb', age=1, name='Sofia', age=1, name='Jack', age=3, name='Luna', age=1, name='Glen', age=1, name='Stella', age=1, name='Zara', age=1, name='Omar', age=1, name='Grace', age=1, name='Bella', age=1, name='Emily', age=1, name='Harper', age=1, name='Logan', age=1\"}";

            BackendChallenge4Model model = JsonSerializer.Deserialize<BackendChallenge4Model>(S);

            // when you deserialize the Data into Object(without create Model) at that time it convert into JsonElement so you first convert this object into
            //JsonElement and then access like below
            Object x = JsonSerializer.Deserialize<Object>(S);
            JsonElement y = (JsonElement)x;

            List<string> s = model.data.Split("age=1,").ToList();

            // here both way you can access proprty. but i dont want print two time data. that's why one is commented.
            Console.WriteLine(model.data);
            //Console.WriteLine(y.GetProperty("data").GetString());
            Console.WriteLine("\n Age=1 count : " + s.Count);

            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }

    }
}
