package others;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rem;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("Reverse is: " + rev);
		if (num == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		sc.close();

	}

}
