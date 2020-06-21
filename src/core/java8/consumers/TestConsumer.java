package core.java8.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<Integer> data = a -> System.out.println("Data Value : "+a);
		data.accept(56);
		
		Consumer<Integer> val = d -> System.out.println("val : "+d);
		val.accept(678);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		
		Consumer<List<Integer>> dataList = record -> list.stream().forEach(a -> {
			System.out.println(a);
		});
		
		dataList.accept(list);		
	}

}
