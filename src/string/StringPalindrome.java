package string;

import java.util.Scanner;

public class StringPalindrome {

	public String reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = new String();
		System.out.println("Enter the string");
		s = sc.nextLine();

		StringPalindrome sp = new StringPalindrome();
		String reversedString = sp.reverseString(s);
		if (s.equalsIgnoreCase(reversedString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}
