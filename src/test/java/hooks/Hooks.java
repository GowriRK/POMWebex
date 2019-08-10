package hooks;

import org.openqa.selenium.OutputType;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import libraries.Annotations;

public class Hooks extends Annotations {
	@AfterStep
	public void afterSteps(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
	}
//
//	@Before
//	public void before() {
//	}
//
//	@After
//	public void after() {
//	}

}
