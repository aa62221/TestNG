  package Package1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Test3 {
	
	private String param ="";

	public Test3(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before SimpleTest class executed.");
	}

	@Test
	public void testMethod() {
		System.out.println("testMethod parameter value is: " + param);
	}
	
//	@Factory
//	public Object[] factoryMethod() {
//		return new Object[] {
//								new Test3("one"),
//								new Test3("two")
//							};
//	}
}

