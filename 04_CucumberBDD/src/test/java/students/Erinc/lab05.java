package students.Erinc;

public class lab05 {
    /* My frameworks are established on Maven,Selenium Web Driver,JUNIT and Cucumber automation tools.I design my frameworks based on
    POM which supports BDD.BDD helps me to create our test cases with Gherkin language.In gherkin language we use basic english
     sentences, so it helps to improve communication between technical and nontechnical members in a project. I have configuration
     properties to keep my data like credentials,browser,url ...and I read these data through configurationReader class in my
     utility package.Then I create feature file to write my test cases, and I define them in steps class in my stepDefinition package.
     After I create separate classes for each page of the application in my pages package. I locate elements related to the
     page in those classes. Also, I create methods in those classes.Then I go to my step class. After creating objects for each page classes
     I call my methods according to the steps. Then I go Runner class in my TestRunner package and write @RunWith(cucumber.class)
     annotation and cucumber options.Inside cucumber options I need some special keywords like feature to define path of feature
     files,glue to define path of stepDefinitions, tags to specify my test cases. Then I can run my test in 3 different ways.
     First, I can run my test in Runner class. Second, I can run it in feature files. Third, I can run it by using Maven options.

     */
}
