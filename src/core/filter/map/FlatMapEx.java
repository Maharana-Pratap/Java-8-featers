package core.filter.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {
		
		// flatMap applied on more critical data structure like List<List<String> or List<List<[]String>>
		List<List<String>> cityList = Arrays.asList(Arrays.asList("Delhi","patna"),
				                                    Arrays.asList("Chapra","Goa"),
				                                    List.of("Ranchi","Sonepur"));
		List<String> datas = cityList.stream().flatMap(data -> data.stream())
				                                     .filter(record -> record.length() > 3)
				                                     .collect(Collectors.toList());
		datas.forEach(System.out::println);
		
	   List<Integer> values = Stream.of(6,5,2).filter(data -> data > 2).collect(Collectors.toList());
	   values.forEach(System.out::println);
	}
}
