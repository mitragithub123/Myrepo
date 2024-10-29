package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ModifyArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana1");
		fruits.add("Banana2");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pine apple");
		fruits.add("Strawberry");

		for (int i = 0; i < fruits.size(); i++) {
			if (fruits.get(i).contains("Ba")) {
				fruits.remove(i);
				i--;
			}
		}
		System.out.println(fruits);

		// Using an Iterator
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			if (fruit.equals("Banana")) {
				iterator.remove();
			}
		}
		System.out.println(fruits);
		
		//Using stream
		fruits.stream()
		.filter(fruit -> !fruit.equals("Apple"))
        .forEach(System.out::println);
		System.out.println(fruits);

	}

}
