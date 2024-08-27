package others;

import java.util.Scanner;

public class GcdNLcm {

	public int calcGcd(int a, int b) {
		// If b is greater than a, it swaps the values of a and b.
		if (b < a) {
			int temp = a;
			a = b;
			b = temp;
		}
		// Euclidean algorithm to find the GCD of two integers a and b.
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();

		GcdNLcm var = new GcdNLcm();

		int gcd = var.calcGcd(num1, num2);
		System.out.println("Gcd is: " + gcd);

		int lcm = (num1 * num2) / gcd;
		System.out.println("Lcm is: " + lcm);

		sc.close();
	}

}
