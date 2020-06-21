package core.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a1","a2","a3");		
		list.stream().findFirst().ifPresent(System.out::println);	
		
		
	}
}
