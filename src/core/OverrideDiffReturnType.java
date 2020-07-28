package core;

class First {
	public Object test() {
		return "from first";
	}
}

class Second extends First {
	
	@Override
	public String test() {
		return "From Second";
	}
}

class Third extends First {
	
	@Override
	public Integer test() {
		return 9;
	}
}

class Four extends First {
	
	void show() {
		System.out.println("From Fourth class");
	}
	
	@Override
	public Four test() {
		return new Four();
	}
}
public class OverrideDiffReturnType {

	public static void main(String[] args) {

		First f1 = new Second();
		System.out.println(f1.test());
		
		First f2 = new Third();
		System.out.println(f2.test());
		
		First f4 = new Four();
		//Four f = (Four) f4.test();
		Four f = (Four) f4;
		f.show();
	}

}
