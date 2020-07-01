package resultstwo;

public class Runner {
	
	public static void main (String[] args) {
		
		results();
			
			
		}
		
		public static void results() {
			
			int physics = 10;
			System.out.println("Your Physics result = " + physics);
			int phyPerc = physics * 100 / 150;
			System.out.println("Your Physics percentage = " + phyPerc + "%");
			
			int chemistry = 100;
			System.out.println("Your Chemistry result = " + chemistry);
			int chemPerc = chemistry * 100 / 150;
			System.out.println("Your Chemistry percentage = " + chemPerc + "%");
			
			int biology = 100;
			System.out.println("Your Biology result = " + biology);
			int bioPerc = biology * 100 / 150;
			System.out.println("Your Biology percentage = " + bioPerc + "%");
			
			int Total = physics + chemistry + biology;
			System.out.println("The total of your results = " + Total);
			
			int Percent = Total * 100 / 450;
			System.out.println("Your overall percentage is " + Percent + "%");
			
			if (Percent < 60) {
				System.out.println("You have failed as your overall percentage was under 60%");
			}
			
			if (phyPerc < 60 && chemPerc >= 60 && bioPerc >= 60) {
			System.out.println("You have failed Physics");
			}
			
			if (phyPerc >= 60 && chemPerc < 60 && bioPerc >= 60) {
			System.out.println("You have failed Chemistry");
			}
			
			if (phyPerc >= 60 && chemPerc >= 60 && bioPerc < 60) {
				System.out.println("You have failed Biology");
			}
			
			if (phyPerc < 60 || chemPerc <60 || bioPerc <60)  {
				System.out.println("Because you have failed one exam, you have failed");
				
			}
//			
			
			
	}

}
