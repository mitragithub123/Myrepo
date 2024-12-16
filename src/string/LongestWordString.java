package string;

public class LongestWordString {

	public static void main(String[] args) {
		String input = "Java is fun";
		String[] words = input.split(" ");
		String longestWord = "";
		for (String word : words) {
			if (words.length > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Longest Word: " + longestWord);
	}
}
