package core;

public class FindSame {

	 public void getVal(String first, String second) {
	       
	       if(null != first && null != second) {
	            if(first.length() > 0 && second.length() > 0) {
	            
	            char[] getF = first.toCharArray();
	            char[] getS = second.toCharArray();
	            int count = 0;
	            for(int i=0; i<getF.length; i++) {               
	               
	               for(int j=0; j<getS.length; j++) {
	                   if(getF[i] == getS[j] ) {
	                        count++;
	                   }
	               
	               }
	               
	               if(getF.length != getS.length && getF.length != count) {               
	                 System.out.println("Provided Strings are different");
	               } 
	            }
	            
	            }
	            
	       
	       }
	  
	  }
	   public static void main(String... args) {
	     FindSame fs = new FindSame();
	     fs.getVal("abc","cabs");
	   
	   }
}
