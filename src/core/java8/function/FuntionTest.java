package core.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuntionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("priya","pintu","kittu Singh","kuttu");
		Function<String , Integer> nameLength = String::length;
		
		List<Integer> output = names.stream().map(nameLength).collect(Collectors.toList());
		System.out.println(output);
	}

}
