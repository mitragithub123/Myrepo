package others;

import java.util.Scanner;

public class FactorialLoop {

	public long calFact(int n) {
		int fact = 1;
		if (n < 0) {
			System.out.println("Error: Factorial is not defined for negative numbers.");
			return -1; // Need to remove from console
		} else if (n == 0) {
			return 1;
		}
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		FactorialLoop fl = new FactorialLoop();
		long result = fl.calFact(num);
		if (result != -1) {
			System.out.println("Factorial is: " + result);
		}
		sc.close();
	}

}
