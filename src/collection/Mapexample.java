package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
				
		map1.put(1, "Suraj");
		map1.put(2, "Niraj");
		map1.put(3, "Sam");
		map1.put(10, "Nammu");
		System.out.println(map1);
		
		
		// update the data in map
		
		map1.put(2, "Jhon");
		
		System.out.println(map1);
		
		//delete entry
		map1.remove(3);
		System.out.println(map1);
		// to get perticular key
		System.out.println(map1.get(1));
		
		//iterate through the map
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
			}
		
		
		//iterate through only keys
		for(Integer val:map1.keySet()) {
			System.out.println("Key is"+ val);
			
			
		}
		
		for(String val : map1.values()) {
			System.out.println("Value is " + val);
			
		}
		
		
		
		//value set
		 
		//============================================
		

		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		//data in order we given		
		map2.put(1, "Suraj");
		map2.put(3, "Niraj");
		map2.put(2, "Sam");
		map2.put(10, "Nammu");
		System.out.println(map2);
		
		//============================================
		
		//acsending order
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Suraj");
		map3.put(2, "Niraj");
		map3.put(3, "Sam");
		map3.put(10, "Nammu");
		System.out.println(map3);
		
		//find occurance of each and every word using map-question
		String str1 = "Clean India Green India Love India";
		
		
	}

}

