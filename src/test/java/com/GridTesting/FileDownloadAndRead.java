package com.GridTesting;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadAndRead {
	static Path filePath;
	public static void main(String[] args) {
		String expectedPath = System.getProperty("user.dir")+"/Downloads";
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://wsform.com/knowledgebase/sample-csv-files/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='industry.csv']")).click();
		try {
			filePath=waitForFile(expectedPath,"industry.csv",10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(filePath!=null) {
			System.out.println("File downloaded");
		}
	}
	
	private static Path waitForFile(String directory, String filename, int timeoutSeconds) throws InterruptedException {
        Path filePath = Paths.get(directory, filename);
        int elapsedTime = 0;
        while (elapsedTime < timeoutSeconds) {
            if (Files.exists(filePath)) {
                return filePath;
            }
            Thread.sleep(1000);
            elapsedTime++;
        }
        return null;
	}
}
