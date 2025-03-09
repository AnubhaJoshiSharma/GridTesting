package com.GridTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestClassForBrowserStack {
    public static final String USERNAME = "abhisheiksharma_ag5yFo";
    public static final String ACCESS_KEY = "mMtsJaoj7Yto3q8W9zpG";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("deviceName","Samsung Galaxy S24");
        options.setPlatformName("ANDROID");  // Set OS for Desktop testing
        options.setBrowserVersion("latest");   // Use latest Chrome version

        WebDriver driver = new RemoteWebDriver(new URL(URL), options);
        driver.get("https://www.merchante.com");
        Thread.sleep(5000);
        driver.quit();
    }
}


