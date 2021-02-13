package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;

public class Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scourceFile = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File destFile = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Screenshot//facebook.png");
		FileUtils.copyFile(scourceFile, destFile);
		
	}

}
