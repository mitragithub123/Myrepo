package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortNShuffle {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);

		Collections.sort(al);// Ascending order
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());// Descending order
		System.out.println(al);

		Collections.shuffle(al);// Shuffle
		System.out.println(al);

	}

}
