package javaAndSeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumBasicMethods {
	
	@Test
	public void allInOn() {
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",new String []  {"enable-automation"});
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alert = driver.switchTo().alert();
		alert.accept();		
	}

}
