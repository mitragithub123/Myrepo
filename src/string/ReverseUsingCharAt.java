package string;

import java.util.Scanner;

public class ReverseUsingCharAt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = new String();
		System.out.println("Enter the string");
		str = sc.nextLine();

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reversed string is: " + rev);
		sc.close();
	}

}
