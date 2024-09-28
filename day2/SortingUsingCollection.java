package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] arrayNames = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List <String> names = new ArrayList <String>();
		
		for(int i=arrayNames.length-1;i>=0;i--) {
			
			names.add(arrayNames[i]);
		}
			Collections.sort(names);
			Collections.reverse(names);
			
			System.out.println(names);
}

}
