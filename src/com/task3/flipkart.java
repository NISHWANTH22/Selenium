package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.flipkart.com/"); Thread.sleep(5000);
		 * 
		 * WebElement id =
		 * driver.findElement(By.xpath(("(//input[@class='_2IX_2- VJZDxU'])[1]")));
		 * id.sendKeys("nishwanth1995@gmail.com"); WebElement pass =
		 * driver.findElement(By.xpath("(//input[@class='_2IX_2- _3mctLh VJZDxU'])[1]"))
		 * ; pass.sendKeys("meenvenk"); WebElement btn =
		 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 * btn.click();
		 */

		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement click = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		click.click();
		WebElement btn = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		btn.click();
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		name.sendKeys("Nishwanth");
		WebElement num = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		num.sendKeys("9750404804");
		WebElement mail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		mail.sendKeys("nishwanth1995@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("meenvenk");
		WebElement btn1 = driver.findElement(By.xpath("//input[@id='continue']"));
		btn1.click();

		Thread.sleep(10000);
		driver.quit();

	}

}
