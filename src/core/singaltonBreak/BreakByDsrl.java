package core.singaltonBreak;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakByDsrl {
 
	public static void main(String[] args) throws Exception {
		Singal s1 = Singal.getObj();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.text"));
		oos.writeObject(s1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.text"));
		Singal s2 = (Singal) ois.readObject();
		
		System.out.println("s1 : "+s1.hashCode()+"\ns2 : "+s2.hashCode());
	}
}
