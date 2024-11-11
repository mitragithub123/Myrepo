package collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Apple");
		v.add("Banana");
		v.add("Cherry");

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
