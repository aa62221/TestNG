package Package1;


import org.testng.annotations.Factory;

public class Test4 {
	
	
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
								new Test3("one"),
								new Test3("two")
							};
	}
	
	protected void m1() {
		System.out.println("Test4");
	}

}



