package core.singaltonBreak;

import java.lang.reflect.Constructor;

public class BreakByRefl {

	public static void main(String[] args) {

		Singal s1 = Singal.getObj();
		Singal s2 = null;
		
		try {
			Constructor cons = Singal.class.getDeclaredConstructor();
			cons.setAccessible(true);
			s2 = (Singal)cons.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("s1 : "+s1.hashCode()+"\n s2 : "+s2.hashCode());
	}

}
