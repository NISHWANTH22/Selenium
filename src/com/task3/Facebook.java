package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.facebook.com/"); WebElement id =
		 * driver.findElement(By.xpath("//input[@id='email']"));
		 * id.sendKeys("dggnhjhngb@gmail.com"); WebElement password =
		 * driver.findElement(By.xpath("//input[@id='pass']"));
		 * password.sendKeys("55674676"); WebElement btn =
		 * driver.findElement(By.xpath("//button[@name='login']")); btn.click();
		 */

		/*
		 * driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		 * driver.manage().window().maximize(); WebElement btn =
		 * driver.findElement(By.xpath("//a[@class='activeLink']")); btn.click();
		 * WebElement click =
		 * driver.findElement(By.xpath("//img[contains(@class,'rounded-circle ')]"));
		 * click.click();
		 * 
		 * Thread.sleep(10000); driver.quit();
		 */
	}

}
