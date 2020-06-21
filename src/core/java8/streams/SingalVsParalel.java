package core.java8.streams;

import java.util.ArrayList;
import java.util.List;

class Emp {
	String name; Long sal;
	
	Emp(String name, Long sal) {
		this.name = name; this.sal = sal;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Long getSal() {
		return sal;
	}
}
public class SingalVsParalel {

	public static void main(String[] args) {
		List<Emp> eList = new ArrayList<>();
		for(int i=0; i<100; i++) {
            eList.add(new Emp("A", 20000L));
            eList.add(new Emp("B", 3000L));
            eList.add(new Emp("C", 15002L));
            eList.add(new Emp("D", 7856L)); 
            eList.add(new Emp("E", 200L)); 
            eList.add(new Emp("F", 50000L));
        }
		
		long t1,t2;
		
		 t1 = System.currentTimeMillis();
			System.out.println("Se1 list : "+eList.stream().filter(e -> e.getSal() > 15000).count());	
			
	     t2 = System.currentTimeMillis();
            System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
        
        t1 = System.currentTimeMillis();
            System.out.println("Paralel Stream : "+eList.parallelStream().filter(e -> e.getSal() > 15000).count());
        
        t2 = System.currentTimeMillis();
           System.out.println("Parelel Stream Taken Time : "+(t2-t1));
	}
}
