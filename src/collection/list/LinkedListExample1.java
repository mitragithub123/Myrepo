package collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("X");
		l1.add("Y");
		l1.add("Z");
		l1.add("A");
		l1.add("B");
		l1.add("C");
		System.out.println(l1);

		LinkedList<String> l2 = new LinkedList<>();
		l2.addAll(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);

		System.out.println("Before sorting: " + l1);
		
		Collections.sort(l1);
		System.out.println("Ascending sorting: " + l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Descending sorting: " + l1);
		
		Collections.shuffle(l1);
		System.out.println("Shuffle: " + l1);

	}

}
