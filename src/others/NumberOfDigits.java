package others;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		num = Math.abs(num); // If negative number entered, then make it positive 1st
		int count = 0;

		if (num == 0) {
			count = 1;
		} else {
			while (num > 0) {
				num = num / 10;
				count++;
			}
		}
		System.out.println("Number of digits: " + count);
		sc.close();

	}

}
/* Algorithm */
//Initialize num = 768, count = 0.
//Divide num = 768 / 10 → 76, increment count = 1.
//Divide num = 76 / 10 → 7, increment count = 2.
//Divide num = 7 / 10 → 0, increment count = 3.