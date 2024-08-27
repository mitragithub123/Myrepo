package string;

import java.util.Scanner;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with special characters");
		String str = sc.nextLine();
		String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after special characters removal: " + cleanStr);
		sc.close();
	}

}
