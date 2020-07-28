package core.filter.map;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Student {
	String name; int age;
	Student(String name, int age) {
		this.name=name; this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return age;
	}
}
public class FilterWithMap {

	public static void main(String[] args) {
	List<Student> students = new ArrayList<>();
	students.add(new Student("kittu",8));
	students.add(new Student("tukka",6));
	students.add(new Student("tukku",4));
	students.add(new Student("muttu",5));
	
	List<String> student = students.stream()
						   .filter(st -> st.age >= 5)
						   .map(Student::getName)
						   .collect(Collectors.toList());
	
	student.forEach(data -> System.out.println(data));
	
	long over5 = students.stream()
			    .filter(s -> s.age >= 5)
			    .count();
	
	System.out.println("Students count over age5 : "+over5);
	
	OptionalInt maxAge = students.stream()
			             .mapToInt(Student::getAge)
			             .max();
	
	if(maxAge.isPresent())
	System.out.println("students max age : "+maxAge.getAsInt());
	
	}
}
