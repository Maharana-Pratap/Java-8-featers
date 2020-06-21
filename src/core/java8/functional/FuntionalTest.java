package core.java8.functional;

@FunctionalInterface
interface Test {
	void test();
	
	/*
	 * @Override public int hashCode();
	 * 
	 * @Override public boolean equals(Object obj);
	 */
}

public class FuntionalTest {

	public static void main(String[] args) {
		int code = 456;
		Test t = () -> {
			System.out.println("from Test Method");
		};
		
		t.test();		
		System.out.println(t.hashCode());
			
	}
	
}
