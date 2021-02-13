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

public class screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");

		Thread.sleep(10000);

		WebElement bot = driver.findElement(By.xpath("(//span[@class='fusion-button-text'])[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", bot);

		Thread.sleep(10000);

		WebElement screen = driver.findElement(By.xpath("(//span[@class='fusion-button-text'])[1]"));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Screenshot\\greenstechnologys.png");
		FileUtils.copyFile(screenshotAs, destfile);

		Thread.sleep(3000);
		WebElement down = driver.findElement(By.xpath("//a[@class='left carousel-control']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].scrollIntoView();", down);

		Thread.sleep(3000);

		 driver.quit();
	}

}
