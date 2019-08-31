package com.How_to_run_Test_in_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo_Double_clicks_on_Element 
{
	// declare the webdriver instance as global
	WebDriver driver;
	
  @Test
  public void Double_clicks_on_Element() 
  {
	  	System.out.println("hai this is @Test Annotaion");
	  	driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		WebElement element=driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		Actions action=new Actions(driver);
		//action.doubleClick(element).build().perform();
		// (or)
		action.moveToElement(element).doubleClick().build().perform();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("hai this is @BeforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("hai this is @AfterMethod Annotation");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("hai this is @BeforeClass Annotation");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("hai this is @AfterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() 
  {		
	  System.out.println("hai this is @BeforeTest Annotation");
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("---disable-notification---");
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("hai this is @AfterTest Annotation");
	 
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("hai this is @BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("hai this is @AfterSuite Annotation");
	  
  }

}
