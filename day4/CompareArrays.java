package week1.day4;

public class CompareArrays {

	public static void main(String[] args) {

		int num1[] = {3,2,11,4,6,7};
		int num2[] = {1,2,8,4,9,7};
		
		int arrays1 = num1.length;
		int arrays2 = num2.length;
		
		for(int i=0;i<arrays1;i++) {
			for(int j=0;j<arrays2;j++) {
				
				if(num1[i] == num2[j]) {
					System.out.println("Matching found "+ num1[i]);
				}
			}
			
		}
		
	}

}
