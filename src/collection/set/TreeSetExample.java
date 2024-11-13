package collection.set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(9);
		numbers.add(1);
		numbers.add(7);
		System.out.println("TreeSet: " + numbers);

		// Trying to add duplicate elements
		numbers.add(3);
		numbers.add(5);
		System.out.println("After adding duplicates: " + numbers);

		System.out.println("First Element: " + numbers.first());
		System.out.println("Last Element: " + numbers.last());

		numbers.remove(7);
		System.out.println("After removing 7: " + numbers);

		System.out.println("Element higher than 3: " + numbers.higher(3)); // 5
		System.out.println("Element lower than 3: " + numbers.lower(3)); // 1

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
