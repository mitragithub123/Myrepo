package collection.list;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>(5,3);// Initial capacity is 5
		// Capacity after this addition will be 8 (5 + 3)

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println(numbers.capacity());
		numbers.add(60);
		System.out.println(numbers.capacity());

	}
}
