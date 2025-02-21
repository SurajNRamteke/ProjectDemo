package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\SurajNareshRamteke\\IdeaProjects\\cucumber\\src\\test\\java\\features\\login.feature",
        glue = {"steps", "hooks"},
        monochrome = true)
public class TestRunner  extends AbstractTestNGCucumberTests {
}
