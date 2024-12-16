package string;

import java.util.HashSet;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String str = "Programming";
		String result = "";
		HashSet<Character> set = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			if (set.add(ch)) {
				result = result + ch;
			}
		}
		System.out.println(result);
	}

}
