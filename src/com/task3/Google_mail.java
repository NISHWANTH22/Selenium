package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_mail {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement namefrt = driver.findElement(By.xpath("//input[@id='firstName']"));
		namefrt.sendKeys("arun");
		WebElement namesec = driver.findElement(By.xpath("//input[@id='lastName']"));
		namesec.sendKeys("kumar");
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("arunkumar");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234567@890");
		Thread.sleep(5000);

		driver.quit();
	}

}
