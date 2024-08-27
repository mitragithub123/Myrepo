package string;

import java.util.Scanner;

public class ReverseUsingCharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = new String();
		System.out.println("Enter the string");
		str = sc.nextLine();

		char arr[] = str.toCharArray();
		String rev = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];
		}
		System.out.println("Reversed string is: " + rev);
		sc.close();
	}

}
