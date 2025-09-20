package Package1;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Test1 {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
 
  
  @BeforeMethod(description ="Setting the Driver")
  public void beforeMethod() {
	      
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Automation Setup\\drivers\\chromedriver133.exe");		 
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");     
		  Reporter.log("Before method is run");
		  softAssert.assertEquals(true, false,"Actual and Expected do not match");	
  }
  
  @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000, expectedExceptions = ElementNotInteractableException.class)
  public void f() {	     
	     WebElement username =driver.findElement(By.id("txtUsername"));
	     JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='admin'",username);
	     Reporter.log("Test method is run");
	     softAssert.assertAll();
  }

  //ITestResult is used to print reporter logs in the emailable report for After method
  @AfterMethod
  public void afterMethod(ITestResult result) {
	  Reporter.setCurrentTestResult(result);
	  Reporter.log("After method is run");
	  driver.quit();
  }
  


}
