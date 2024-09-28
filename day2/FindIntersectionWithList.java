package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionWithList {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
        List<Integer> aList = new ArrayList<Integer>();
        for(int i=0;i<=arr1.length-1;i++) {
        	aList.add(arr1[i]);
            }
        Collections.sort(aList);
    	System.out.println("The first list :" + aList);
    	
        List<Integer> bList = new ArrayList<Integer>();
        for(int j=0;j<=arr2.length-1;j++) {
        	bList.add(arr2[j]);
    		}
         Collections.sort(bList);
     	System.out.println("The Second list :" + bList);
     	
     	for(int i=0;i<aList.size();i++) {
     		if(bList.contains(aList.get(i))) {
     			System.out.println("Intersection found at :" +aList.get(i));
     		}
     	}



	}

}
