package streamsAPI.map;

import java.util.Arrays;
import java.util.List;

public class FilterStringsLengthGreater3ConvertUppercase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "cat", "banana", "dog", "elephant");
		words.stream().filter(s -> s.length() > 3).map(s -> s.toUpperCase()).forEach(System.out::println);

	}

}
