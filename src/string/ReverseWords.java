package string;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();
		String words[] = str.split(" ");

		String reverseString = "";

		for (String w : words) {
			String reverseWord = ""; // Reset reverseWord for each word
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("Reverse Each Word in a String: " + reverseString);
		sc.close();

	}

}
