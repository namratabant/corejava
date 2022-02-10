package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>arraylist1 = new ArrayList<String>();//declaration//
		arraylist1.add ("Raj");//0 index//
		arraylist1.add("Priya");//1 index location//
		arraylist1.add("Namrata");
		arraylist1.add("Sanvi");
		
		
		System.out.println("The size of arraylist is " + arraylist1.size());
	    System.out.println(arraylist1);
	    System.out.println("The element at 2 index is " + arraylist1.get(2));		
	    arraylist1.remove(0);
	
	System.out.println("The size of arraylist is " + arraylist1.size());
	 System.out.println(arraylist1);
	 
	 arraylist1.set(1, "supriya");//to replace value at 1st position using set//
	 
	 //iterating through arraylist//
	 for (int index=0;index<arraylist1.size();index++) {//for  loop method to itterate through all the elements//
		 
		 System.out.println(arraylist1.get(index));
	 }
	
	 for  (String name:arraylist1) { //one more for loop method to itterate through all the elements//
		 System.out.println(name);
		 
	 }
	
	// Iterator<String> itr = arraylist1.iterator() ;
		
		//while(itr.hasNext()) {
			
			//System.out.println(itr.next());
	
	//sorting an arraylist//
	
	Collections.sort(arraylist1);
	System.out.println(arraylist1);

	


	}}






