package core.threading;

class Test extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
}
public class TestJoin {

	public static void main(String[] args) {

		try {
			Test t1 = new Test();
			t1.setName("t1");
			Test t2 = new Test();
			t2.setName("t2");
			Test t3 = new Test();
			t3.setName("t3");
			
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
