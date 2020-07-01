package conditionals.one;

public class Runner {

	public static void main(String[] args) {
		
		printmachine(3,2, true);
		

	}
	
	public static void printmachine (int num1, int num2, boolean mathsdecide) {
		
		if (mathsdecide == true) {
			int answer = num1 + num2;
			System.out.println(answer);
			}
		else {
			int answer2 = num1 * num2;
			System.out.println(answer2);
		}
		
		if (num1 % 2 == 0 || num2 % 2 == 0) {
		System.out.println("0");
	}
		
		
	}

}
