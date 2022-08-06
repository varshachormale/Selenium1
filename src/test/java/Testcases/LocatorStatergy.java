package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorStatergy {
	
@Test

public void locators() {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.findElement(By.id("demo-request"));
	driver.findElement(By.className("demo-request try-it-page"));
	driver.findElement(By.tagName("footer"));
	driver.findElement(By.linkText("Contact Sales"));
	driver.findElement(By.partialLinkText("Contact"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.cssSelector("div[id='10']"));
	driver.findElement(By.cssSelector("div#10"));
	//driver.findElement(By.xpath(//div[@id='10']));
}
}
