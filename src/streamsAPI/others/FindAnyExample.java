package streamsAPI.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		Optional<String> anyName = names.stream().findAny();
		System.out.println(anyName.get());

		Optional<String> firstName = names.stream().findFirst();
		System.out.println(firstName.get());

	}

}
