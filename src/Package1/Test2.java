package Package1;


import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	
	
//	@BeforeMethod
//	  public void beforeMethod() {
//		System.out.println("Before Method"+Thread.currentThread().getId());  
//		
//	  }   
	  
	//check the output when 4 threads are running parallely
	
	  @Test
	  public void f() {
		   System.out.println("Test Method f() is run by thread :  "+Thread.currentThread().getId());
		   
	  }
	  
	  @Test(dataProvider= "Parameters", threadPoolSize = 5)
	  public void message(String message1, String message2) {
		  System.out.println("Hello " + message1 +" & " +message2);
		  System.out.println("Thread : "+Thread.currentThread().getId());
		  Reporter.log(message2);
	  }
	  
	  //running test cases parallel using Data provider
	  @DataProvider(name ="Parameters", parallel =true)
	  public Object[][] dp(){
		  return new Object[][] {{"Akshay","Kimaya"},{"Gargi","Atul"}};
		  
		  }
//	  “What if I don’t set data-provider-thread-count?”
//	  (Answer: By default, TestNG uses the global thread-count from suite/test level, otherwise 10.)
	 
//	  @AfterMethod
//	  public void afterMethod(ITestResult result) {
//		  System.out.println("After Method"+Thread.currentThread().getId());
//		
//	  }
}
