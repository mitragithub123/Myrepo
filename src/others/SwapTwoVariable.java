package others;

import java.util.Scanner;

public class SwapTwoVariable {
	public void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();

		System.out.println("Result after swapping....");

		SwapUsingTemp var = new SwapUsingTemp();
		var.swap(num1, num2);
		sc.close();
	}

}