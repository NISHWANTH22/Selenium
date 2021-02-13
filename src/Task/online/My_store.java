package Task.online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_store {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);
		WebElement creat = driver.findElement(By.id("email_create"));
		creat.sendKeys("nishwanth1995@gmail.com");
		WebElement creatbtn = driver.findElement(By.id("SubmitCreate"));
		creatbtn.click();
		Thread.sleep(10000);
		WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		mr.click();
		WebElement name = driver.findElement(By.id("customer_firstname"));
		name.sendKeys("Nishwanth");
		WebElement secname = driver.findElement(By.name("customer_lastname"));
		secname.sendKeys("V");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("meenvenk");
		WebElement date = driver.findElement(By.id("days"));
		date.click();
		Select s = new Select(date);
		s.selectByValue("22");
		WebElement month = driver.findElement(By.id("months"));
		month.click();
		s.selectByVisibleText("March");
		WebElement year = driver.findElement(By.id("years"));
		year.click();
		s.selectByValue("1997");
		
		
	}

}
