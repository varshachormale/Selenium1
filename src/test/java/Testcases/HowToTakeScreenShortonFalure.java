package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Utility;

public class HowToTakeScreenShortonFalure {
	
	WebDriver driver;
	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test
	public void takescreenshotOnFalure() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
	}
	@Test
	public void takescreenshotOnFailure() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(false);
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus());
		{
			Utility.takeScreenshot(driver, result.getName());
		}
	}

}
