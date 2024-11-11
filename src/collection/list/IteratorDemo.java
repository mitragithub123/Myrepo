package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Dog");
		list.add("Cat");
		list.add("Rabbit");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String animal=itr.next();
			System.out.println(animal);
			if ("Dog".equals(animal)) {
				itr.remove();
			}
		}
		System.out.println(list);

	}

}
