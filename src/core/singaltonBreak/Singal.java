package core.singaltonBreak;

import java.io.Serializable;

public class Singal implements Serializable,Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singal obj = null;
	
	private Singal() {}
	
	public static Singal getObj() {
		
		if (null == obj) {
			synchronized(Singal.class) {
				if (null == obj) {
					obj = new Singal();
				}
			}
		}
		return obj;
		}
	
	    @Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

