package core;


public class ExcepTest {
	
	int i = 9; int j = 0;
	
	@SuppressWarnings("finally")
	public int getVal() {
		try {
			int a = i/j;
			return 1;
		} catch (Exception ex) {
			return 8;
		} finally {
			return 7;
		}
	}
    
	public static void main(String[] args) {
		ExcepTest et = new ExcepTest();
		System.out.println(et.getVal());
	}
}
