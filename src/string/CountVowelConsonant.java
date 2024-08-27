package string;

import java.util.Scanner;

public class CountVowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine().toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else if ((ch >= 'a' && ch <= 'z')) { // If this condition is not included then it will count spaces
				consonantCount++;
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);
		sc.close();
	}

}
