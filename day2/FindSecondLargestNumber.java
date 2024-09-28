package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		 int[] numbers = {3,2,11,4,6,7};
		 
         List<Integer> numberList = new ArrayList<Integer>();
        
         for(int i=0 ; i<numbers.length; i++) {
        	
         numberList.add(numbers[i]);
   }
         Collections.sort(numberList);
        
    	 System.out.println(numberList);
    	
         int seclarnum = numberList.get(4);

     	 System.out.println("The second largest number is : " + seclarnum);

	}

}
