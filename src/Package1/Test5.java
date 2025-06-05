package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test5 implements Comparable<Test5>{
	int id;
	
	Test5(int id){
		this.id=id;
	}
	
	public String toString() {
		return "Id is "+ id;
	}
	
	public static void main(String[] args) {
		
		 
		List<Test5> list2 = new ArrayList<Test5>();
		list2.add(new Test5(10));
		list2.add(new Test5(15));
		list2.add(new Test5(9));
		list2.add(new Test5(8));
	
		Collections.sort(list2); // Compare to method is called here to sort the list
		for(Test5 ls1:list2) {
		      System.out.println(ls1);
		}
		
		Set<String> set = new TreeSet<String>();
		set.add("Test");
		set.add("Akshay");
		set.add("Bimelesh");
		
		 Iterator<String> itr =set.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			
		 }
		
		
	}

	@Override
	public int compareTo(Test5 o) {
//		if(id==o.id) {
//			return 0;			
//		}
//		else if(id<o.id) {
//			return -1;                //--------To reverse the order, you can change this to return 1;
//		}
//		else
//		return 1;
		return this.id - o.id; 
	}
	//This happens internally when we call Collections.sort(list2);
	//for (int i = 0; i < list2.size() - 1; i++) {------> it will iterate till second last element only so that it can compare with the last element.
    //list2.get(i).compareTo(list2.get(i + 1));
}


