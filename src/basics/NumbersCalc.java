package basics;

public class NumbersCalc {
	public static void main (String[] args) {
		System.out.println("Program starting.");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println("The product is " + multiplyNumbers(numA, numB));
	
	}
	
	static void printName() {
		System.out.println("My name is Michael");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB; 
		return product;
		
	}

}
