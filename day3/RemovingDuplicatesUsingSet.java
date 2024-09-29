package week3.day3;

import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicatesUsingSet {

	public static void main(String[] args) {
		String str = "google";
		char[] charArray = str.toCharArray();
		
		Set <Character> name = new TreeSet <Character>();
		
		for(int i =0;i<charArray.length;i++) {
			
			name.add(charArray[i]);
		}
		
		System.out.println("Name after duplicate "+name);

	}

}
