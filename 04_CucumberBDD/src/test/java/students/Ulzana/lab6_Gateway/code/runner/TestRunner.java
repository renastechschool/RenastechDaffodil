package students.Ulzana.lab6_Gateway.code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/students/Ulzana/lab6_Gateway/Payment_Gateway.feature",
        glue = "students/Ulzana/lab6_Gateway/code/stepDefinitions"
)




public class TestRunner {
}
