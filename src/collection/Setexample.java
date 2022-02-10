package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new HashSet<String>();//in random order//
		set1.add("name1");
		set1.add("name1");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
		set1.add(null); //set can execute null only once//
		
		System.out.println(set1); //output in reverse order.set wont allow duplicate values
	
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();//in a given order//
		
		set2.add("name1");
		set2.add("name1");
		set2.add("name3");
		set2.add("name4");
		set2.add("name5");
		set2.add(null);
	
		
		System.out.println(set2);
		

		TreeSet<String> set3 = new TreeSet<String>();//ascending order//
		
		set3.add("name1");
		set3.add("name1");
		set3.add("name3");
		set3.add("name4");
		set3.add("name5");
		//set3.add(null); we can not add null value to tree set 
	
		
		System.out.println(set3);
		
		//String str4 ="Clean World Green World"; //interview quetion remove all the duplicate from string//
	
	}
	
	

}
