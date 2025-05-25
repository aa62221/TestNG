package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.interactions.Actions;

public class Test6 extends Test4{

	public static void main(String[] args) {

		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		
		ArrayList<Integer> j = new ArrayList<Integer>();
		j.add(4);
		j.add(3);
		j.add(2);
		j.add(1);
		j.add(5);
		
		j.retainAll(i);
		System.out.println(j);
		
		String s = "Pankaj";
		char[] q=s.toCharArray();
		System.out.println(s.lastIndexOf("j"));
		System.out.println(String.valueOf("P"));
		
		String.valueOf("P");
		
	Test4 t = new Test6();
	t.m1();
	 
 }
	protected void m1() {
		System.out.println("Test6");
	}
	
	

	
//	Actions actionObj = new Actions(driver);
//          actionObj.keyDown(Keys.CONTROL)
//         .sendKeys(Keys.chord("A"))
//         .keyUp(Keys.CONTROL)
//         .perform();

}
