package collection.list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(2, 25); // Insert 25 at index 2
		System.out.println("Vector after additions: " + numbers);

		int firstElement = numbers.firstElement();
		int lastElement = numbers.lastElement();
		int specificElement = numbers.get(3);
		System.out.println("First Element: " + firstElement);
		System.out.println("Element at index 3: " + specificElement);
		System.out.println("Last Element: " + lastElement);

		numbers.remove(2);
		numbers.remove(Integer.valueOf(40));// for Strings, animals.remove("Cat");
		System.out.println("Vector after removals: " + numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		numbers.clear();
        System.out.println("Vector after clearing: " + numbers);
	}

}
