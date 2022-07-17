package students.Ulzana.lab3_guru.code.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/students/Ulzana/lab3_guru/guru.feature",
                        glue = "students/Ulzana/lab3_guru/code/steps"

)


public class test {

}
