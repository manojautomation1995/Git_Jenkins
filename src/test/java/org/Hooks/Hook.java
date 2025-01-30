package org.Hooks;

import org.Helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseClass {

	@Before
	public void browserOpen(){
			chromeopen();
			maxwin();
			implecitwait();
	}

	@After(order = 2)
	public void tkscrshot(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) getDriver();
			byte[] sc = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(sc, "Failed Scenario", "img.png");
		}
	}

	@After(order = 1)
	public void browserClose() {
		browserclose();
	}
}
