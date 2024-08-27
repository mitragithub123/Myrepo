package array;
import java.util.Scanner;

public class ArrayAdditionOneDimensionalKeyboardInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		int arr1[] = new int[len];
		int arr2[] = new int[len];
		int res[] = new int[len];

		System.out.println("Enter values for the first array:");
		for (int i = 0; i < len; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter values for the second array:");
		for (int i = 0; i < len; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < len; i++) {
			res[i] = arr1[i] + arr2[i];
		}

		System.out.println("Result of adding the two arrays:");
		for (int i = 0; i < len; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}
