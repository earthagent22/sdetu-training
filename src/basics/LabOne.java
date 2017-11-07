package basics;

public class LabOne {
	public static void main(String[] args) {
		System.out.println(Sum(4));
		System.out.println(factorial(6));
		int[] bubbles = {1, 7, 15, 5, 36, 2, 4, 26};
		minimumVal(bubbles);
		
		
		
	}
	public static int Sum(int n) {
		int sum = n;
		if(n <= 0) {
			System.out.println("Invalid entry");
			return -1;
		} else {
			for(int i= 1; i<n; i++) {
				sum = sum + i;
			}
			return sum;
		}
	}
	
	public static int factorial(int n) {
		int product = n;
		if(n==0) {
			return 1;
		} else if(n<0) {
			System.out.println("Undefined");
			return -1;
			
		} else {
			for(int i = 2; i < n; i++) {
				product = product * i;
			}
			return product;
		}
	}
	
	public static int minimumVal(int[] n) {
		int min = n[0];
		for(int i = 1; i <= n.length; i++) {
			if(n[i] < min) {
				min = n[i];
			}
		}
		System.out.println(min);
		return min;
	}

}
