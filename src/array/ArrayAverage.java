package array;
import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array: ");
		int len = sc.nextInt();
		int sum = 0;
		double avg = 0;

		int arr[] = new int[len];

		if (len <= 0) {
			System.out.println("Error; Array length must be greater than 0.");
			sc.close();
			return;
		}

		System.out.println("Enter " + len + " elements:");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		avg = (double) sum / len;

		System.out.println("Sum of elements: " + sum);
		System.out.println("Average of elements: " + avg);

		sc.close();

	}

}
