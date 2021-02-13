package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.redbus.in/"); driver.manage().window().maximize();
		 * Thread.sleep(1000); WebElement btn =
		 * driver.findElement(By.xpath("//i[@id='i-icon-profile']")); btn.click();
		 * WebElement enter = driver.findElement(By.xpath("//li[@id='signInLink']"));
		 * enter.click(); WebElement number = driver.findElement(By.
		 * xpath("//input[@placeholder='Enter your mobile number']"));
		 * number.sendKeys("9750404805"); Thread.sleep(10000); driver.quit();
		 */

		driver.get("https://www.cleartrip.com/trains");
		Thread.sleep(20000);

		WebElement btn = driver.findElement(By.xpath("//a[text()='Register']"));
		btn.click();
		WebElement email = driver.findElement(By.xpath("//input[@class='email required']"));
		email.sendKeys("nishwanth1995@gmail.com");
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='registerButton']"));
		btn1.click();
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Nishwanth@22");
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("nishwanth");

		Thread.sleep(20000);

		driver.quit();

	}

}
