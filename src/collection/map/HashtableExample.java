package collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(101, "John");
		table.put(102, "David");
		table.put(103, "Scott");
		table.put(104, "Marie");
		table.put(105, "Tie");
		table.put(103, "x");
		System.out.println(table);

		System.out.println(table.get(105));

		table.remove(103);
		System.out.println(table);

		System.out.println(table.containsKey(101));
		System.out.println(table.containsValue("John"));

		System.out.println(table.isEmpty());

		System.out.println(table.keySet()); // Returns all keys as a set
		System.out.println(table.values()); // Returns all values as a collection
		System.out.println(table.entrySet()); // Returns all entries as a set

		// Printing all keys
		for (Integer key : table.keySet()) {
			System.out.println(key);
		}

		// Printing all values
		for (String value : table.values()) {
			System.out.println(value);
		}

		// Printing all keys and values
		for (Integer key : table.keySet()) {
			System.out.println(key + "--->" + table.get(key));
		}

		// Using entry methods
		for (Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// Using iterator
		Set<Map.Entry<Integer, String>> set = table.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " >>> " + entry.getValue());
		}
	}

}
