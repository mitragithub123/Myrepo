package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Grapes");
		linkedHashSet.add("Mango");

		Iterator<String> itr = linkedHashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
