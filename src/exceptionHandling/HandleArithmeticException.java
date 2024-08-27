package exceptionHandling;

import java.util.Scanner;

public class HandleArithmeticException {
// Thrown when an exceptional arithmetic condition has occurred, such as divide by zero.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number1: ");
		int a = sc.nextInt();

		System.out.println("Enter number2: ");
		int b = sc.nextInt();
		int res;
		try {
			res = a / b;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Number can not be divided by 0");
		}
		System.out.println("Program ends...");
		sc.close();
	}

}
