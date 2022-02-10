package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class queexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> pq1 = new PriorityQueue<String>();
	
	pq1.add("nick");
	pq1.add("swaroop");
	pq1.add("sanvi");
	
	System.out.println(pq1);//shows elements in the priorityqueue//
	System.out.println("First element" + pq1.peek());//shows 1st element//
	System.out.println("First element" + pq1.poll());//eliminate the element in the 1st place//
	System.out.println(pq1);
	
	ArrayDeque<String> dq1 = new ArrayDeque<String>();
	dq1.add("nick");
	dq1.add("swaroop");
	dq1.add("sanvi");
	System.out.println(dq1);
	
	System.out.println(dq1.peek());
	System.out.println(dq1.peekFirst());
	System.out.println(dq1.peekLast());
	
	//System.out.println(dq1.poll());// remove 1st element//
	//System.out.println(dq1.pollFirst()); //remove 1st element//
	System.out.println(dq1.pollLast()); //remove last element//
	
	System.out.println(dq1);
	
	}

}
