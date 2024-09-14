package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] num = {1,4,3,2,8,6,7};
		
		Arrays.sort(num);
		int lengthOfArrays = num.length;
		
		for(int i=0;i<lengthOfArrays;i++) {
			
			if(num[i]!=i+1) {
				
				System.out.println("Missing number is "+ (i+1));
				
				break;
			}
		}
		
	}

}

// 0 1 2 3 4 5 6
//{1,2,3,4,6,7,8}