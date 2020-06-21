package core.singaltonBreak;

public class SingalTest {

	public static void main(String[] args) {
		Singal s1 = Singal.getObj();
		Singal s2 = Singal.getObj();
		
		System.out.println("s1 : "+s1.hashCode()+" s2 : "+s2.hashCode());
	}
}
