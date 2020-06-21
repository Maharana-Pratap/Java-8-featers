package core;

public class TestBuffer {

	public static void main(String[] args) {

		//String s = "abc";
		StringBuffer b1 = new StringBuffer("abc");
		StringBuffer b2 = new StringBuffer("abc");
		
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
	}

}
