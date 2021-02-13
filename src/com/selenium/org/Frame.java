package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("SingleFrame");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("frame");
		driver.switchTo().parentFrame();

		WebElement text1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		text1.click();

		WebElement outer = driver.findElement(By.xpath("(//iframe[contains(@style,'float')])[2]"));
		driver.switchTo().frame(outer);

		Thread.sleep(3000);
		WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		WebElement frame3 = driver.findElement(By.xpath("//input[@type='text']"));
		frame3.sendKeys("heloooooooo");

	}

}
