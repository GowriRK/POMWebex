package runner;

import io.cucumber.testng.CucumberOptions;
import libraries.Annotations;

@CucumberOptions(features = "src\\test\\java\\features\\CL.feature", glue = { "pages", "hooks" }, plugin = { "pretty",
		"html:Reports" })
public class Runner extends Annotations {

}
