package string;

import java.util.Scanner;

public class EvenIndexedCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(input.charAt(i));
			}
		}
		// Another approach
		for (int i = 0; i < input.length(); i += 2) {
			System.out.print(input.charAt(i) + " ");
		}
		sc.close();
	}

}
