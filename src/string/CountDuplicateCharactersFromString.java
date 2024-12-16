package string;

import java.util.HashSet;

public class CountDuplicateCharactersFromString {

	public static void main(String[] args) {
		String str = "Programming";

		HashSet<Character> set = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			if (set.add(ch)) {
				int count = 0;
				for (char c : str.toCharArray()) {
					if (c == ch) {
						count++;
					}
				}
				if (count > 1) {
					System.out.println("Character '" + ch + "' appears " + count + " times.");
				}
			}
		}
	}

}
