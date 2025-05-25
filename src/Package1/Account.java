package Package1;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Account implements OnlineAccount, Comparable<Account> {

	int noOfRegularMovies;
	int noOfExclusiveMovies;
	String OwnerName;
	int Cost;	
	
	Account(int noOfRegularMovies, int noOfExclusiveMovies, String OwnerName ){
		
		this.noOfExclusiveMovies = noOfExclusiveMovies;
		this.noOfRegularMovies = noOfRegularMovies;
		this.OwnerName = OwnerName;		
	}
	
	public int monthlyCost() {	
		Cost = basePrice+ noOfRegularMovies*RegularMoviePrice + noOfExclusiveMovies*ExclusivePrice;	
		return Cost;		
	}
	
	public String toString() {
		return "Owner name is "+OwnerName + " Monthly Cost is "+ monthlyCost();
	}
	
	@Override
	public int compareTo(Account at) {
		
		if(monthlyCost()==at.monthlyCost())
		return 0;
		else if(monthlyCost()>at.monthlyCost())
		return 1;
		else
		return -1;
	}	
	
//	public static void main(String[]args) {
//		
//		Account act1 = new Account(30, 10, "Akshay");
//		Account act2 = new Account(20, 10, "Sameer");
//		System.out.println(act1);		
//		System.out.println(act2);
//		
//	}
	
	

	

}
