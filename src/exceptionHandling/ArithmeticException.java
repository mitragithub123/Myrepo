package exceptionHandling;

import java.util.Scanner;

public class ArithmeticException {
// Thrown when an exceptional arithmetic condition has occurred, such as divide by zero.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number1: ");
		int a = sc.nextInt();

		System.out.println("Enter number2: ");
		int b = sc.nextInt();
		int res = a / b;
		System.out.println(res);
		System.out.println("Program ends...");
		sc.close();
	}

}
