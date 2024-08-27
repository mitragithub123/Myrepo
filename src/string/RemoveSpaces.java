package string;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with spaces");
		String str = sc.nextLine();
		String cleanStr = str.replaceAll(" ", "");
		System.out.println("String after spaces removal: " + cleanStr);
		sc.close();

	}

}
