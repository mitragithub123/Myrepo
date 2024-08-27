package string;

import java.util.Scanner;

public class ReverseWords2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();
		String words[] = str.split("\\s");

		String reverseString = "";

		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseString = reverseString + sb.toString() + " ";
		}
		System.out.println("Reverse Each Word in a String: " + reverseString);
		sc.close();

	}

}
