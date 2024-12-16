package string;

import java.util.Arrays;

// Check whether two strings are anagrams (contain the same characters in a different order).
public class AnagramCheckString {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		boolean isAnagram = Arrays.equals(charArray1, charArray2);
		System.out.println("Strings are Anagrams: " + isAnagram);
		// or
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Strings are Anagrams: true");
		} else {
			System.out.println("Strings are Anagrams: false");
		}

	}

}
