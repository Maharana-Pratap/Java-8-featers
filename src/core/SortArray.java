package core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArray {

	Integer[]  data = {88,9,9,7,6,5};
	Integer[] bdata= new Integer[9];
	public void show() {
		Arrays.sort(data);
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<data.length; i++) {
			//set.add(data[i]);
			bdata[i]=data[i];
		}
		
		for(int j=0; j<bdata.length; j++) {
			System.out.println(bdata[j]);
		}
		
	}
	
	public static void main(String[] args) {
		
		new SortArray().show();
	}
}
