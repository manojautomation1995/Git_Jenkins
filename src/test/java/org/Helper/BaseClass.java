package org.Helper;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public static WebDriver driver;

	public static void setDriver(WebDriver driver) {
		tdriver.set(driver);
	}

	public static WebDriver getDriver() {
		return tdriver.get();
	}

	public static void chromeopen() {
		driver = new ChromeDriver();
		setDriver(driver);
		getDriver();
	}

	public static void firefoxopen() {
		driver = new FirefoxDriver();
		setDriver(driver);
		getDriver();
	}

	public static void maxwin() {
		getDriver().manage().window().maximize();
	}

	public static void filltxt(WebElement ele, String txt) {
		ele.sendKeys(txt);

	}

	public static void btnclk(WebElement ele) {
		ele.click();

	}

	public static void openurl(String url) {
		getDriver().get(url);
	}

	public static void implecitwait() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void waits(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void browserclose() {
		getDriver().quit();

	}

	public static String PageTitle() {
		String title = getDriver().getTitle();
		return title;
	}

	@AfterClass
	public void tearDown() {
		tdriver.remove();
	}

}
