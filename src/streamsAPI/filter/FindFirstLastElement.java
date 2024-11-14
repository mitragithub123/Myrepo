package streamsAPI.filter;

import java.util.Arrays;
import java.util.List;

public class FindFirstLastElement {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		list.stream().filter(s -> s.startsWith("b")).forEach(System.out::println);
		list.stream().filter(s -> s.endsWith("y")).forEach(System.out::println);

	}

}
