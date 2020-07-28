package core.adapterEx;

public class Main {

	public static void main(String[] args) {
		
		Crow c = new Crow();
		BabyToy t = new BabyToy();	
		
		Toy ad = new BirdAdaptor(c);
		
		System.out.println("Crow");
		c.fly();
		c.speak();
		
		System.out.println("\n Toy");
		t.createSound();
		
		System.out.println("\n Using Adaptor to Toy");
		ad.createSound();
	}
}
