package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String sub =scn.nextLine();
		int t = Integer.parseInt(sub);

		ArrayList<Account> list = new ArrayList<Account>();
		for(int i=0;i<t;i++) {
			String[] input = scn.nextLine().split(" ");
			list.add(new Account(Integer.parseInt(input[0]),Integer.parseInt(input[1]),input[2]));
		}
		
	     Collections.sort(list);
	     
	     System.out.println("Most valuable acccount details : ");
	     System.out.println(list.get(list.size()-1));
         scn.close();

	}

}
