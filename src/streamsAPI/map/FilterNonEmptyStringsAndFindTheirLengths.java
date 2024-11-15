package streamsAPI.map;

import java.util.Arrays;
import java.util.List;

public class FilterNonEmptyStringsAndFindTheirLengths {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "", "banana", "", "cherry", "date");
		words.stream().filter(word -> !word.isEmpty()).map(String::length).forEach(System.out::println);

	}

}
