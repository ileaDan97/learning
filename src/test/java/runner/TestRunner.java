package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("SpellCheckingInspection")
@RunWith(Cucumber.class)

@CucumberOptions(
        features={"src/main/java/features/"},
        glue= {"steps"},
        plugin = {"pretty",
                "json:target/cucumber-report-json/report.json",
                "html:target/cucumber-report-html/report.html"}
)

public class TestRunner {
}
