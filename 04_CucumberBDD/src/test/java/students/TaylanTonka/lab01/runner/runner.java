package students.TaylanTonka.lab01.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/students/TaylanTonka/lab01/features", //This is to connect feature files with Runner so that Cucumber can identify them
        //path from content root
        glue = "students/TaylanTonka/lab01/stepDefination", //this is to connect steps definitions with cucumber
        //path from source root
        tags = "", //Without tags it will run everything that is present under feature files. When you put tags it will only
        //run tagged ones
        dryRun = false //This will give you undefined steps directly without running existing steps in a scenario or feature file.

)
public class runner {
}
