package students.HaticeKarakoyun;

public class lab05 {

    // Explain your Cucumber BDD Framework Structure

    /*     Cucumber is an open-source testing framework that supports Behavior Driven Development for automation testing of web applications.
           The tests are first written in a simple scenario form that describes the expected behavior of the system from the user’s perspective.

           Cucumber framework mainly consists of three major parts – Feature File, Step Definitions, and the Test Runner File.

           In my current company, firstly, we created Page Object Model with hybrid framework for Automating our Test Cases.
           Then, we added same dependency on POM to make our code maintainable, readable and reusable.
           Then, we wrote our scenarios under Feature File with Gherkin language(Keywords such as GIVEN, WHEN, and THEN)

           Secondly, we created our Step Definitions to know which batch of code needs to be run for a given scenario.

           Thirdly, we need a Test Runner File to run our test cases.
           Test Runner Class containing the Step Definition location and the other primary metadata required to run the test.
           For example, Test Runner Class in cucumberTest package,
           with the feature files in “src/test/Feature” location and Step Definition files in “src/main/stepDefinition” folder.

           End the end, before run our tests, we create Configuration.properties file.
           In Selenium, properties files are mainly used to store GUI locators / elements,
           and also Global fields like database configuration details.Each parameter in properties file are stored as a pair of strings,
           in key and value format, where each key is on one line.
           We can easily read properties from some file using object of type Properties.
           Foe example,we are passing the properties values to the webdriver and printing the values at end.

          URL ::http://gmail.com
          User name::testuser
          Password::password123

 */
}
