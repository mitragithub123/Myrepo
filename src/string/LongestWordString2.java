package string;

import java.util.Arrays;
import java.util.List;

public class LongestWordString2 {

	public static void main(String[] args) {
		String input = "Java is fun";
		List<String> words = Arrays.asList(input.split(" "));
		String longestWord = words.stream().max((a, b) -> Integer.compare(a.length(), b.length())).orElse("");
		System.out.println("Longest word: " + longestWord);
	}
}
