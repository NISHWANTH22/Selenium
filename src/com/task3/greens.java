package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		Thread.sleep(10000);
		WebElement core = driver.findElement(By.xpath("//a[@data-target='#java']"));
		core.click();
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
