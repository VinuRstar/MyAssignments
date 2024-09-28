package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,10,6,8};
        List<Integer> numberList = new ArrayList<Integer>();
        
        for(int i=0 ; i<numbers.length; i++) {
        	
            numberList.add(numbers[i]);
      }
        Collections.sort(numberList);
   	    System.out.println(numberList);
   	    
   	    for(int i = 0;i<numberList.size()-1;i++) {
   	    	if(numberList.get(i)+1!=numberList.get(i+1)) {
   	    		
   	    		System.out.println("Gap Found between :" + numberList.get(i) + "and" + numberList.get(i+1));
   	    		for(int j=numberList.get(i)+1;j<numberList.get(i+1);j++) {
   	    			
   	    			System.out.println("Missing numbers are :"+ j);
   	    			
   	    		}
   	    	}

   	    }
   	    

	}

}
