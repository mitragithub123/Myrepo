package collection.set;

import java.util.HashSet;

public class HashSetExample3 {

	public static void main(String[] args) {

		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		System.out.println(hs1);

		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println(hs2);

		// Union
		HashSet<Integer> unionSet = new HashSet<>(hs1);
		unionSet.addAll(hs2);
		System.out.println("Union: " + unionSet);

		// Intersection
		HashSet<Integer> intersectionSet = new HashSet<>(hs1);
		intersectionSet.retainAll(hs2);
		System.out.println("Intersection: " + intersectionSet);

		// Difference
		HashSet<Integer> differenceSet = new HashSet<>(hs1);
		differenceSet.removeAll(hs2);
		System.out.println("Difference: " + differenceSet);

		// Sub set
		boolean isSubset = hs1.containsAll(hs2);
		System.out.println("Is hs2 a subset of hs1? " + isSubset);

	}

}
