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

public class Greensscreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Screenshot\\greenstechnologys.png");
		FileUtils.copyFile(sourcefile, destfile);

		/*
		 * driver.get("https://www.toolsqa.com/"); Thread.sleep(5000);
		 * driver.manage().window().maximize(); WebElement down =
		 * driver.findElement(By.xpath("//div[@class='share-link-description']"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", down);
		 * Thread.sleep(3000); WebElement up =
		 * driver.findElement(By.xpath("//img[@id='MjI0OjM0MA==-1']"));
		 * js.executeScript("arguments[0].scrollIntoView();", up);
		 */

		/*
		 * driver.get("http://www.greenstechnologys.com/"); WebElement btn =
		 * driver.findElement(By.xpath("//img[contains(@src,'https://images.dmca.')]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", btn);
		 * Thread.sleep(3000); TakesScreenshot ts = (TakesScreenshot) driver; File
		 * sourcefile = ts.getScreenshotAs(OutputType.FILE); File destfiFile = new File(
		 * "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\Screenshot\\greenstechnologys.png"
		 * ); FileUtils.copyFile(sourcefile, destfiFile); driver.quit();
		 */
	}

}
