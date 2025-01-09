package string;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounterInString {

	public static void main(String[] args) {
		String str = "Java is a programming language. Java is also an island of Indonesia. Java is widely used language";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String words[] = str.split(" ");
		for (String w : words) {
			if (map.containsKey(w)) {
				map.put(w, map.get(w) + 1);
			} else {
				map.put(w, 1);
			}
		}
		System.out.println(map);

	}

}
