package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //This is to connect feature files with Runner so that Cucumber can identify them
        glue = "code/stepDefinitions", //this is to connect steps definitions with cucumber
        tags = ""


)





public class TestRunner {
}
