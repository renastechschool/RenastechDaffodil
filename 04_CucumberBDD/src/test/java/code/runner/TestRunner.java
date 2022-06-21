package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //This is to connect feature files with Runner so that Cucumber can identify them
        //path from content root
        glue = "code/stepDefinitions", //this is to connect steps definitions with cucumber
        //path from source root
        tags = "@TC10" //Without tags it will run everything that is present under feature files. When you put tags it will only
        //run tagged ones


)
public class TestRunner {
}
