package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleDropdownNotUnderSelect {
	@Test
	public void dropDown() {
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:/Selenium setup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();
		
		driver.findElement(By.xpath("//ul[@id=country-scroll']//li/span[text()='Nepal']"));
		
	}

}
