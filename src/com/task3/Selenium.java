package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/contact.php");
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("arun");
		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("defrhty@gmail.com");
		WebElement mobile = driver.findElement(By.id("InputSubject"));
		mobile.sendKeys("8796404903");
		WebElement coure = driver.findElement(By.name("courses"));
		coure.sendKeys("java");
		WebElement branchname = driver.findElement(By.name("branch"));
		branchname.sendKeys("adayar");
		WebElement start = driver.findElement(By.name("time"));
		start.sendKeys("10.30am");
		WebElement details = driver.findElement(By.name("comments"));
		details.sendKeys("good");
		WebElement btn = driver.findElement(By.id("submit"));
		btn.click();

		Thread.sleep(7000);
		driver.quit();
	}
}