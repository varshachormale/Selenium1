package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.Utility;

public class HomePageTestCases {
	
	HomePage homePage;
	WebDriver driver;

	
	@BeforeClass
	public void launchUrl() {
		driver=Utility.getDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
		
	}
	@Test
	public void verifyFromFieldSelection()
	{
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName");
		System.out.println(homePage.getUserNameTextBox().getAttribute("Placeholder"));
		System.out.println(homePage.getUserNameTextBox().getCssValue("background-colour"));
		System.out.println(homePage.getUserNameTextBox().getSize().getHeight());
		System.out.println(homePage.getUserNameTextBox().getSize().getWidth());
		//Thread.sleep(1000);
		//handle multiple webelement method
		
		homePage.getUserNameTextBox().clear();
		//Thread.sleep(1000);
		homePage.getUserNameTextBox().sendKeys("UserName2");
	
		//homePage.setGenderRadioButton();
		//System.out.println("Is selected"homePage.getGenderRadioButton().isSelected());
		
	     //Utility.clickUsingJavaScript(homePage.getGenderRadioButton(),driver);
		System.out.println("WebElement is displayed"+homePage.getUserNameTextBox().isDisplayed());
	
	    //System.out.println("Is selected"+homePage.getGenderRadioButton()).isSelected());
		//Utility.clickUsingJavaScript(homePage.getGenderRadioButton(),driver);
		homePage.setDateOfBirthInputField();
		Utility.scrollIntoView(homePage.getDateOfBirthInputField(), driver);
		homePage.getDateOfBirthInputField().click();
		WebElement select= driver.findElement(By.xpath("//select[@class='react-datepicker_year-select']"));
		Utility.selectValueFromDropdown(select,"2010");
		Utility.selectDateFromDatePicker(driver, "10");
		
		//select hobbies checkbox
		homePage.setHobbiesCheckBox();
		Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
		homePage.getFileUpload().sendKeys("C:\\Users\\Amol\\Desktop\\jars\\chromedriver.exe");
		
		}
}
	/*@AfterClass
	public void tearDown(){
		
		//driver.quit();
		
	}*/
