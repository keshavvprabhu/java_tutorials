package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/reports/html/results.html",
        "json:target/reports/json/results.json",
        "junit:target/reports/junit/results.xml" },
        features="src/test/resources/features")
public class TestRunner {

}
