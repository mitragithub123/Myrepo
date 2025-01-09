package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "John");
		map.put(102, "David");
		map.put(103, "Scott");
		map.put(104, "Marie");
		map.put(105, "Tie");
		map.put(103, "x");
		System.out.println(map);

		System.out.println(map.get(105));// Accessing value by key
		map.remove(103);
		System.out.println(map);

		System.out.println(map.containsKey(101));
		System.out.println(map.containsValue("John"));

		System.out.println(map.isEmpty());

		System.out.println(map.keySet());// Returns all the keys as key set
		System.out.println(map.values());// Returns all the values as collection
		System.out.println(map.entrySet());// Returns all the entries as set

		// Print all the keys as key set
		for (Integer k : map.keySet()) {
			System.out.println(k);
		}

		// Print all the values as collection
		for (String v : map.values()) {
			System.out.println(v);
		}

		// Print all the keys and values
		for (Integer k : map.keySet()) {
			System.out.println(k + "--->" + map.get(k));
		}

		/* Entry methods */
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

		// or,
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + ">>>" + entry.getValue());
		}

	}

}
