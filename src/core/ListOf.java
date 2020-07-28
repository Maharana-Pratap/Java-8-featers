package core;

import java.util.Arrays;
import java.util.List;

public class ListOf {

	public List<String> getList() {
		return List.of(
				"java" , ".net" , "php" , "oracle"
				);
	}
	
	public List<String> getArrList() {
		return Arrays.asList("one" , "tow" ,"three" , "four");
	}
	
	public static void main(String[] args) {
		ListOf lf = new ListOf();
		lf.getList().forEach(System.out::println);
		
		lf.getArrList().forEach(System.out::println);
	}
}
