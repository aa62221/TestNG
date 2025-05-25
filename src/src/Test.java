package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	
 int x=10;
 static int y=10;
 
 void m11(Test test) {
     System.out.println("Instance method");
}
static void m1(Test t) {
       System.out.println("Static method");
}

 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Welcome";
		
		for( int i=0; i<s.length()-2;i++) {
			
			System.out.println(s.substring(i,i+3));
		}
	 System.out.println(y);
		
		
		s=s.concat("World");
		System.out.println(s);
	
	}
	
	public static void method1() {
		
//		 static int z=10;
		//above line gives error, because these are local variable and they do not have existence outside this method.
		//System.out.println(x);
		//above line gives error as non static member cannot be accessed in static method.
		System.out.println(y);
	}
    public void method2() {
		
    	//static int z=10;
    	//above line gives error
		System.out.println(x);
		System.out.println(y);
	}
}
