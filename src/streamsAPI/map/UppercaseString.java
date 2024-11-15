package streamsAPI.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseString {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("alice", "bob", "charlie");

		List<String> upperCaseNames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames);
		// or
		names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		// or
		names.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}
