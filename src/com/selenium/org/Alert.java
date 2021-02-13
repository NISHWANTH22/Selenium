package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");


		
		
		/*
		 * WebElement btn =
		 * driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 * btn.click();
		 * 
		 * org.openqa.selenium.Alert alert = driver.switchTo().alert(); alert.accept();
		 */
		
		
		/*
		 * WebElement Alertwith =
		 * driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']"));
		 * Alertwith.click(); Thread.sleep(3000); WebElement btn =
		 * driver.findElement(By.xpath("(//*[contains(text(),'click the button')])[2]"))
		 * ; btn.click(); org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		 * Thread.sleep(3000); alert2.dismiss();
		 */

		WebElement btn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btn.click();
		WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		btn1.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("hello");
		alert.accept();
	}

}
