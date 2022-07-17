package students.gule;

public class lab05 {
    //Explain your Cucumber BDD Framework Structure

//My Framework is a hybrid framework which supports both BDD
// (Behaviour Driven Development) and Data Driven Testing.
//My framework is based on the page object model and OOP Concept.
// Basically, we are creating java class for each web page of my application,
// and we store all web elements in these classes.
// And we use Page factory to initialize web elements to class.
// The reason why I am using POM is to keep my code organize and clean.
// We have Utils package where we store all common methods such as initializing web driver, Screenshot method,
// Java scrip executor methods and get property methods.
// We also have resources package where we keep our feature files and configuration properties.
// We use Gherkin language to explain my positive and negative test scenarios in feature file.
// In configuration properties file we keep our sensitive data such URL, username, password etc.
// There is also another package for step definitions where I implement all my of scenario’s step definitions.
// On the other hand, we have test runner class where we have cucumber options
// such as features, glue, tags, dry run and plugins for reporting.
// We can also get reports in different types of data format such as HTML and JSON.
// With the help of OOP concept,
// We can extend my base class to my other classes and use it.
}
