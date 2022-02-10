package collection;

import java.util.HashSet;

public class Removeduplicatesusingset {

	public static void main(String[] args) {
	
		
		String str1 ="Clean World Green World";
		
		HashSet<String> hs1 = new HashSet<String>();
		for (String word : str1.split(" ")) {
			hs1.add(word);
		}
	System.out.println(hs1);
}	
	
}



