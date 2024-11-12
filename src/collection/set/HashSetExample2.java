package collection.set;

import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {

		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);

		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumbers);
		System.out.println(numbers);
		
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);

	}

}
