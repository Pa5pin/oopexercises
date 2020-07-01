package conditionals.two;

public class Runner {

	public static void main(String[] args) {
//		if a is between 2000 and 4000 print E
//		if a is more than 2000 print A
//		if a is between 4000 and 6000 print B
//		if a is more than 4000 print D
//		if a is more than 6000 print C
//		if a is less than 2000 print 1
//		if a is 
		
		matrix(4001);

	}
	
	public static void matrix(int num) {
		
		if (num > 2000) {
			System.out.println("A");
			
		} else if (num < 2000) {
			System.out.println("1");	
		}
		
		if (num > 6000) {
			System.out.println("C");
		} else if (num <6000 && num >2000){
			System.out.println("B");
		}
		
		if (num > 4000) {
			System.out.println("D");
		} else if (num <4000 && num >2000){
			System.out.println("E");
		}
		
		if (num > 100 && num <2000) {
			System.out.println("3");
		} else if (num < 100) {
			System.out.println("2");
			
		}
		
		if (num >600 && num <2000) {
			System.out.println("5");
		} else if (num <600 && num >100) {
			System.out.println("4");
		}
		
		if (num > 500 && num < 600) {
			System.out.println("6");
		} else if (num < 500 && num > 100) {
				System.out.println("7");
		}
		
		
		
		
	}
	
	

}
