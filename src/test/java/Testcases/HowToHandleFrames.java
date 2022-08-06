package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleFrames {
	@Test
	public void handleFrame(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//Webdriver method
		System.out.println("CurrentUrl"+driver.getCurrentUrl());
		System.out.println("Title:"+driver.getTitle());
		System.out.println(driver.getPageSource());
		
		//Handle Multiple Window
		WebElement element=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(element);
		String str=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println("str");
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//header/a")).getAttribute("href"));
	}

}
