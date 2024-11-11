package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");

		ListIterator<String> litr = list.listIterator();
		// Forward traversal
		while (litr.hasNext()) {
			String color = litr.next();
			System.out.println(color);
			if ("Blue".equals(color)) {
				litr.set("Yellow");
			}
		}
		System.out.println(list);
		// Backward traversal
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());

		}

	}

}
