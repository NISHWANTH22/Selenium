package Task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtcGobal {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		Thread.sleep(3000);
		WebElement down = driver.findElement(By.xpath("//a[@data-target='#interview28']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object gobal = js.executeScript("arguments[0].scrollIntoView();", down);
		Thread.sleep(3000);

		WebElement btn = driver.findElement(By.xpath("//a[@data-target='#interview28']"));
		btn.click();

		WebElement screen = driver.findElement(By.xpath("(//div[@class='modal-body'])[2]"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scourefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Screenshot\\greenstechnologys.png");
		FileUtils.copyFile(scourefile, destfile);

		driver.quit();
	}

}
