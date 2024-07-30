package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features/Activity5.feature",
		glue = {"stepDefinitions"},
		tags = "@activity5",
		publish=true,
		plugin= {
				"pretty",
				"html:src/reports/HTML_Report.html",
				"json:src/reports/Json_Report.json",
				"junit:src/reports/XML_Report.xml"
		},
		monochrome=true
	)
public class TestRunner { }
