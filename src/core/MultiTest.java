package core;

interface Loan {
	int sort(int i);
	//void big(String s);
}
public class MultiTest {

	public static void main(String[] args) {
		Loan l1 = i -> { return i; };		    
			System.out.println("I am from sort Loan "+l1.sort(9));
			
	    Loan l2 = (a) -> 89;
	         System.out.println("From loan "+l2.sort(9));
	}
}
