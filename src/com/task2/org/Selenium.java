package com.task2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.lvbankonline.in/index.html?module=login");
		 * driver.manage().window().maximize(); Thread.sleep(20000); WebElement
		 * login_name = driver.findElement(By.
		 * xpath("//oj-input-text[contains(@class,'oj-inputtext ')]"));
		 * login_name.sendKeys("nishwanth"); WebElement login_pass =
		 * driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 * login_pass.sendKeys("234354");
		 */

		// driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.93854813.1130226057.1612781191-1772910659.1612781191&_gl=1*1cwtddh*_ga*MTc3MjkxMDY1OS4xNjEyNzgxMTkx*_ga_SKB78GHTFV*MTYxMjg0ODM5OC4yLjAuMTYxMjg0ODQxMC40OA..");
		// WebElement element =
		// driver.findElement(By.xpath("//input[contains(@class,'login')]"));
		// element.sendKeys("trytthhfdc");
		// WebElement mobile = driver.findElement(By.xpath("//input[@name='DUMMY2']"));
		// mobile.sendKeys("9750404904");

		// driver.get("https://twitter.com/LOGIN");
		// Thread.sleep(10000);
		// WebElement username =
		// driver.findElement(By.xpath("//input[@name='session[username_or_email]']"));
		// username.sendKeys("nishwanth");
		// WebElement pass =
		// driver.findElement(By.xpath("//input[@name='session[password]']"));
		// pass.sendKeys("325566");

		// WebElement log = driver.findElement(By.xpath("//span[text()='Log in']"));
		// log.click();

		// driver.get("https://www.swiggy.com/");
		// WebElement search = driver.findElement(By.id("location"));
		// search.sendKeys("porur");
		// WebElement find = driver.findElement(By.xpath("//h1[@class='sZsUd']"));
		// find.click();

		/*
		 * driver.get("https://www.snapdeal.com/login"); WebElement name =
		 * driver.findElement(By.id("userName")); name.sendKeys("arun"); WebElement
		 * loging = driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
		 * loging.click();
		 */
		/*
		 * driver.get("https://www.instagram.com/"); Thread.sleep(10000); WebElement
		 * user = driver.findElement(By.name("username")); user.sendKeys("nish");
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("1234657888"); Thread.sleep(10000); WebElement log =
		 * driver.findElement(By.
		 * xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"
		 * )); log.click();
		 */
		/*
		 * driver.get("https://www.irctc.co.in/nget/train-search"); WebElement from =
		 * driver.findElement(By.id("origin")); from.sendKeys("madurai"); WebElement
		 * destingnation = driver.findElement(By.id("chennai"));
		 * destingnation.sendKeys("chennai");
		 */

		driver.get("https://adactin.com/contact/");
		WebElement mail = driver.findElement(By.xpath("//input[@name='your-email']"));
		mail.sendKeys("dsfdghg@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@name='tel-492']"));
		phone.sendKeys("9750404804");
		WebElement log = driver.findElement(By.xpath("//input[@type='submit']"));
		log.click();

		Thread.sleep(20000);
		driver.quit();

	}

}
