package core;

@FunctionalInterface 
interface Java {
	void show();
	default void test() {
		System.out.println("from java test");
	}
}

public class TestFuntional {	
	TestFuntional() {
		System.out.println("from constructor");
	}
    
	public void ride() {
		System.out.println("from ride");              
	}
	
	public static void main(String[] args) {

		Java j = () -> {
			System.out.println("from show overloaded");
		};
		
		j.test();
		j.show();
				
		TestFuntional t = new TestFuntional();  // For method ref example;
		Java jv = t::ride;
		jv.show();
		
		Java ja = TestFuntional::new;  // Constructor ref example
		ja.show();
	}
}
