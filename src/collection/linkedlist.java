package collection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>list1 = new LinkedList<String>();
list1.addLast("sanvi");
	list1.add("Jhon");
	list1.add("Donald");
	list1.add("Jack");
	list1.add("Jack");
list1.addFirst("namrata");
	System.out.println(list1);
	
	for(int index=0;index<list1.size();index++) {
		
		System.out.println(list1.get(index));
	}

	
	}

}
