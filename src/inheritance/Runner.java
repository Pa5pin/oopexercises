package inheritance;

public class Runner {
	
public static void main (String[] args) {
		
		Animal cat = new Cat(0, false, null, 0);
		
		cat.setNumLegs(4);
		cat.setCanFly(false);
		cat.setEats("Cat food");
		System.out.println(cat.toString());
		
//		Animal cat2 = new Cat(1, false, "cat food");
//		System.out.println(cat2.toString());
		
	}

}
