package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement email_address = driver.findElement(By.id("email"));
	email_address.sendKeys("nishwanth435@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("2343254");
	
	WebElement Login_btn = driver.findElement(By.name("login"));
	Login_btn.click();
	
	}
}
