package others;

import java.util.Scanner;

public class PrimeNo {

	public boolean isPrime(int num) {
		// 0 and 1 are not prime numbers
		if (num <= 1) {
			return false;
		}
		// 2 is the only even prime number
		else if (num == 2) {
			return true;
		}
		// Exclude all other even numbers
		else if (num % 2 == 0) {
			return false;
		}
		// The program then checks for factors from 3 up to the square root of the
		// number, incrementing by 2 (to check only odd numbers). If any divisor is
		// found, the number is not prime.
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true; // If no factors are found, num is prime
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		PrimeNo prime = new PrimeNo();
		
		if (prime.isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		sc.close();
	}

}
