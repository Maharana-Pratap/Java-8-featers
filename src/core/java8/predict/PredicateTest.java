package core.java8.predict;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pre = Arrays.asList("java","jnet","mano","maharana");
		Predicate<String> data = str -> str.startsWith("m");
		
		pre.stream().filter(data).forEach(d -> System.out.println("Predicate Condition start with 'm' : "+d));
		
		Predicate<String> lengthCheck = str -> str.length() > 4;
		pre.parallelStream().filter(lengthCheck).forEach(a -> System.out.println("Predicate conddition Length >= 5 : "+a));
	}

}
