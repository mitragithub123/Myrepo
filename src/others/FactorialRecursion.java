package others;

import java.util.Scanner;

public class FactorialRecursion {

	public long calFact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calFact(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		FactorialRecursion fl = new FactorialRecursion();
		long result = fl.calFact(num);
		System.out.println("Factorial is: " + result);

		sc.close();
	}

}
