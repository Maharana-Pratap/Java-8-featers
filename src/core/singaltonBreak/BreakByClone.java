package core.singaltonBreak;

public class BreakByClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singal s1 = Singal.getObj();
		Singal s2 = (Singal) s1.clone();
		
		System.out.println("s1 : "+s1.hashCode()+"\ns2 : "+s2.hashCode());
	}

}
