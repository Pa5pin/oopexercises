package maths;

public class Runner {
	
	public static void main (String[] args) {
		
		multiply(14.8,24.6);
		subtract(1,2);
		divide(10,2.4);
	}
	
	public static void multiply(double num1, double num2) {
		
		double answer = num1 * num2;
		System.out.println(answer);
	}
	public static void subtract(double num1, double num2) {
		
		double answer = num1 - num2;
		System.out.println(answer);
	}
	public static void divide (double num1, double num2) {
		
		if (num1 < num2){
		
		double answer = num1 / num2;
		System.out.println(answer);
		}
		
		else {
			
			System.out.println("Unable to perform operation");
		}
	}
	
}

