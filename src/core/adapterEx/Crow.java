package core.adapterEx;

public class Crow implements Bird {

	@Override
	public void fly() {		
		System.out.println("flying");
	}

	@Override
	public void speak() {
		System.out.println("caon caon");
	}

}
