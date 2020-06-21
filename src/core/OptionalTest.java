package core;

import java.util.Optional;

class Testing {
	private Testing() {}
	
	private static Testing obj = new Testing();
	
	public static Optional<Testing> getObj() {
		return Optional.of(obj);
	}
	
	public void show() {
		System.out.println("from Testing calling!");
	}
}
public class OptionalTest {

	public static void main(String[] args) {
		
		Optional<Testing> ot = Testing.getObj();
		if(!ot.isEmpty()) {
			Testing t1 = ot.orElse(null);
			t1.show();
		}
	}
}
