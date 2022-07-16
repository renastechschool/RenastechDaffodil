package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = " src/test/resources",//This is to connect feature files w/runner so cucumber can identify
            glue = "src/test/java/StepDefinitions",//this connects to step definitions w/ customer
            tags = ""
    )

    public class TestRunner {
}
