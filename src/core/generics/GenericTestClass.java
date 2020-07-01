package core.generics;

class Student {
	int id; String name;
	
	Student(int id, String name) {
		//super();
		this.id=id; this.name=name;
	}
}

class Emp {
int id; String name;
	
    Emp(){}
	Emp(int id, String name) {
		this.id=id; this.name=name;
	}
}

class Call<T> {
	T obj;
	
	Call(){}
	Call(T obj) {
		this.obj=obj;
	}
	
	public T getObj() {
		return obj;
	}
}

public class GenericTestClass {
	
	public static void main(String[] args) {
		Call c = new Call(new Emp(3,"java"));
		Emp e = (Emp) c.obj;
		System.out.println(e.id+"\n"+e.name);
	}
}
