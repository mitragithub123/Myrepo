package others;

import java.util.Scanner;

public class ReverseNumber {

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
		sc.close();

	}

}
/* Algorithm */
//Repeat the following steps until the number becomes 0:
//Find the last digit of the number (rem = num % 10).
//Multiply the current value of rev by 10 and add the remainder to it (rev = (rev * 10) + rem).
//Remove the last digit from the original number (num = num / 10). As the datatype is interger
//Suppose 768/10 will give 76 it will ignore decimal value.