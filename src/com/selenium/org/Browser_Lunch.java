package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Lunch {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.google.com/search?q=facebook&oq=fa&aqs=chrome.0.69i59j46i67j35i39j0i20i131i263i433j0i131i433j0i433j0i67j0i271.2949j0j15&sourceid=chrome&ie=UTF-8");

		// driver.manage().window().maximize();
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().to("https://www.flipkart.com/");
		// driver.navigate().back();
		// driver.navigate().refresh();
		// driver.navigate().forward();

		// Thread.sleep(7000);
		// driver.quit();

		// System.setProperty("webdriver.ie.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
		// WebDriver driver1 = new InternetExplorerDriver();
		// driver1.get("https://www.amazon.in");

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\geckodriver.exe");
		// WebDriver driver2 = new FirefoxDriver();
	//	driver2.get("https://www.flipkart.com/");

	}
}