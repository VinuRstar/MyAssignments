package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int sum;
	
		
		for (int i=0;i<=8;i++) {
		sum = a+b;
		a=b;
		b=sum;
			System.out.println("Fibonacci numbers upto range 8 are "+a);
		}
			
			
		
	}

}
