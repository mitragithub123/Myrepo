package others;

import java.util.Scanner;

public class EvenorOdd {
	public void checkEvenOrOdd(int no) {
		if (no % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		EvenorOdd ob = new EvenorOdd();
		ob.checkEvenOrOdd(number);
		sc.close();
	}

}
