package core.java8.functional;

@FunctionalInterface
interface Tv {
	int remote();
}

interface Count {
	int add(int a , int b);
}
public class FunInterfaceTest {	
	public static void main(String[] args) {
		
		Tv tv ;
		
		tv = () -> 9;
		
		System.out.println("first tv : "+tv.remote());
		
		tv = () -> 5*9;
		
		System.out.println("Second tv : "+tv.remote());
		
		Tv t = new Tv() {
			@Override
			public int remote() {
				return 9*9;
			}
		};
			System.out.println("Old tv model : "+t.remote());	
			
			
			Count count;
			
			count  = (a,b) -> a+b;
			System.out.println("count : "+count.add(5, 7));

			count = (c,d) -> c-d;
			System.out.println("subtraction : "+count.add(9, 3));
	}
	
	
}
