package week9;

import java.util.Hashtable;
import java.util.Iterator;

public class p {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(191, "Matthew");
		h1.put(181, "Mike");
		h1.put(171, "John");
		h1.put(131, "James");
		h1.put(134, "Mohammed");
		h1.put(156, "Nabila");
		h1.put(189, "Sharmila");
		h1.put(123, "Silvia");
		h1.put(111, "Erik");
		h1.put(113, "Muneeza");
		//h1.remove(113);
		System.out.println(h1);
	}

}
