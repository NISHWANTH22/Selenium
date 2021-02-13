package com.task2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		// driver.get("https://www.redbus.in/");
		// WebElement from_name = driver.findElement(By.id("src"));
		// from_name.sendKeys("vandavasi");
		// WebElement to_name = driver.findElement(By.id("dest"));
		// to_name.sendKeys("chennai");

		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.name("q"));
		google.sendKeys("Greens Technology");
		WebElement search = driver.findElement(By.name("btnK"));
		search.click();

		// driver.get("https://www.lvbankonline.in/index.html?module=login");
		// WebElement name = driver.findElement(By.id("login_username|input"));
		// name.sendKeys("nishwanth");
		// WebElement password = driver.findElement(By.id("login_password|input"));
		// password.sendKeys("23455");

		// driver.get("https://twitter.com/login");
		// WebElement findElement =
		// driver.findElement(By.xpath("//input[@name='session[username_or_email]']"));
		// findElement.sendKeys("nish");

	}

}
