package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"src/test/java/stepDefinitions"},
       // add scenario tag which we planning to run
        tags = {"@smoke"},
        plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {

}