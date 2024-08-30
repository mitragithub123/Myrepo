package collection.arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); // Creating an array list

		// Adding elements to the ArrayList
		fruits.add("Apple");
		fruits.add("Banana1");
		fruits.add("Banana2");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pine apple");
		fruits.add("Strawberry");

		// Printing the ArrayList
		System.out.println("Fruits: " + fruits);

		// Accessing Elements using index
		String fruit1 = fruits.get(0);
		System.out.println("Fruit1: " + fruit1);

		// Modifying Elements using index
		fruits.set(0, "Orange");
		System.out.println("Fruits: " + fruits);

		// Removing by index
		fruits.remove(0);
		System.out.println("Fruits after removal: " + fruits);

		// Removing by object
		fruits.remove("Mango");
		System.out.println("Fruits after removal: " + fruits);

		// Size of array list
		int size = fruits.size();
		System.out.println("Size of the ArrayList: " + size);

		// Iterating Over an ArrayList
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}

		// or,
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Checking if ArrayList Contains an Element
		boolean hasMango = fruits.contains("mango");
		System.out.println(hasMango);

		// Clear array list
		fruits.clear();
		System.out.println("ArrayList after clear: " + fruits);
	}
}
