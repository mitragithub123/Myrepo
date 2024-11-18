package streamsAPI.others;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		// At least one element matches the condition.
		boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));
		System.out.println("Any name starts with 'A': " + anyStartsWithA); // true

		// All elements match the condition.
		boolean allStartWithA = names.stream().allMatch(name -> name.startsWith("A"));
		System.out.println("All names start with 'A': " + allStartWithA); // false

		// None of the elements match the condition.
		boolean noneStartWithZ = names.stream().noneMatch(name -> name.startsWith("Z"));
		System.out.println("No name starts with 'Z': " + noneStartWithZ); // true
	}

}
