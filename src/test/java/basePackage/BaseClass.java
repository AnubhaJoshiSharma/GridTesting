package basePackage;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseClass {

	public enum RunnerBrowsers {
		CHROME, FIREFOX, GRIDFIREFOX, GRIDCHROME;
	}

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	@Parameters({ "browserName" })
	@BeforeMethod
	public void setUpApplication(String browserName) {

		try {
			RunnerBrowsers browser = RunnerBrowsers.valueOf(browserName.toUpperCase());
			URL gridUrl = new URL("http://192.168.1.95:4444/wd/hub");
			switch (browser) {

			case GRIDCHROME:
				Reporter.log("Requesting execution on Chrome browser-GRID", true);
				ChromeOptions option = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				driver.set(new RemoteWebDriver(gridUrl, option));
				break;

			case GRIDFIREFOX:
				Reporter.log("Requesting execution on firefox browser - GRID", true);
				FirefoxOptions foptions = new FirefoxOptions();
				WebDriverManager.firefoxdriver().setup();
				driver.set(new RemoteWebDriver(gridUrl, foptions));
				break;
			case CHROME:
				Reporter.log("Requesting execution on Chrome browser", true);
				ChromeOptions localoption = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				driver.set(new ChromeDriver(localoption));
				break;

			case FIREFOX:
				Reporter.log("Requesting execution on firefox browser", true);
				FirefoxOptions localfoptions = new FirefoxOptions();
				WebDriverManager.firefoxdriver().setup();
				driver.set(new FirefoxDriver(localfoptions));
				break;

			default:
				Reporter.log("Invalid browser option provided", true);
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			Reporter.log("The argument provided for the browser types in invalid", true);
		}
		if (getDriver() != null) {
			getDriver().get(ConfigReader.readApplicationUrl());
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	}

	@AfterMethod
	public void cleanUp() {
		if (getDriver() != null) {
			getDriver().quit();
			driver.remove();
		}
	}
}
