package array;
import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array: ");
		int len = sc.nextInt();

		int arr[] = new int[len];

		if (len <= 0) {
			System.out.println("Error; Array length must be greater than 0.");
			sc.close();
			return;
		}

		System.out.println("Enter " + len + " elements:");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < len; i++) { // Start from index 1 (This means that max and min already hold the value of the
										// first element, so there is no need to compare it again.)
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		// Print results
		System.out.println("Maximum element: " + max);
		System.out.println("Minimum element: " + min);

		sc.close();
	}

}
