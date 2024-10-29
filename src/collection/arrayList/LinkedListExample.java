package collection.arrayList;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();

		/* Adding elements to the LinkedList */
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Watermelon");
		fruits.add("Cherry");
		fruits.addFirst("Orange");// Add to beginning
		fruits.addLast("Grapes");// Add to end

		System.out.println("LinkedList after additions: " + fruits);

		/* Accessing elements */
		String firstFruit = fruits.getFirst();
		String lastFruit = fruits.getLast();
		String secondFruit = fruits.get(1);

		System.out.println("First Fruit: " + firstFruit);
		System.out.println("Last Fruit: " + lastFruit);
		System.out.println("Second Fruit: " + secondFruit);

		/* Removing elements */
		fruits.removeFirst();
		fruits.removeLast();
		fruits.remove(1);
		fruits.remove("Watermelon");
		System.out.println("LinkedList after removal: " + fruits);

		/* Checking if the list contains an element */
		boolean isPresent = fruits.contains("Apple");
		System.out.println(isPresent);

		/* Iterating through the LinkedList */
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		/* Another approach */
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		/* Clearing all elements */
		fruits.clear();
		System.out.println("LinkedList after clearing: " + fruits);

	}

}
