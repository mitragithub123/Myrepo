package collection.set;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		// HashSet hs1 = new HashSet(); // Default capacity=16, Load factor=0.75
		// HashSet hs2 = new HashSet(100);// Initial capacity=100
		// HashSet hs3 = new HashSet(100, 0.95f);// Default capacity=100, Load
		// factor=0.95

		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("Welcome");
		hs.add(true);
		hs.add(false);
		hs.add('A');
		hs.add(null);
		System.out.println(hs); // Insertion order is not preserved.

		System.out.println("Size of the HashSet: " + hs.size());

		hs.remove(100);
		System.out.println(hs);

		System.out.println(hs.contains("Welcome"));

		for (Object set : hs) {
			System.out.println(set);
		}

	}

}
