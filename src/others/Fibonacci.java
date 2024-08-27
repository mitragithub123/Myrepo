package others;

import java.util.Scanner;

public class Fibonacci {
	public void calcFibonacci(int n) {
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		Fibonacci fl = new Fibonacci();
		fl.calcFibonacci(num);
		
		sc.close();
	}

}
