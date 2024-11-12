package collection.list;

import java.util.Vector;

public class VectorExample3 {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>(5);// Initial capacity is 5
		// Capacity after 5th element insertion will be doubled. (5*2=10)

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
