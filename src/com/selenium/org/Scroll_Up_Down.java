package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	//	WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	//	Thread.sleep(3000);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", amazon_logo);
	//	Thread.sleep(3000);
	//	js.executeScript("arguments[0].scrollIntoView(false);", amazon_logo);

		// js.executeScript("window.scrollBy(0,3000)");
		// Thread.sleep(10000);
		// js.executeScript("window.scrollBy(0,-3000)");
		
		
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btn.click();

		WebElement help = driver.findElement(By.xpath("//span[text()='Help Center']"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);", help);
	//	WebElement top = driver.findElement(By.xpath("//h2[@class='_2cAig-']"));
		
	//	js.executeScript("arguments[0].scrollIntoView();", top);
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-3000)");
		
		
		
		
	}

}
