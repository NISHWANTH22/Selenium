package com.selenium.org;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email_address = driver.findElement(By.xpath("//input[@id='email']"));

		email_address.sendKeys("gffh@gmail.com");

		WebElement password = driver.findElement(By.xpath("(//input[@class ='inputtext _55r1 _6luy'])[2]"));
		password.sendKeys("4325465");

		WebElement creat_btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		creat_btn.click();

		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select s = new Select(day);
		s.selectByValue("3");
		System.out.println(s.isMultiple());

		List<WebElement> x = s.getOptions();
		for (WebElement webElement : x) {

			System.out.println(webElement.getText());

		
		}
			driver.quit();
	}
}
