package array;
import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/* Declaring array */

		// Approach 1
		int a[][] = new int[3][2];
		// int [][]a = new int[3][2];
		// int []a[] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		// Approach 2
		int b[][] = { { 10, 20 }, { 30, 40 } };

		// Find size of an array
		System.out.println("Length of array a is: " + a.length);
		System.out.println("Length of columns a is: " + a[0].length); // Here 0 is the row no

		// Read single value from an array
		System.out.println(a[2][0]);
		System.out.println(b[1][1]);

		/* Reading all the values from an array */

		// Approach 1-Using for loop
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}

		// Approach 2-Using enhanced for loop (for...each loop)
		for (int arr[] : a) {
			for (int x : arr) {
				System.out.print(x + "  ");
			}
			System.out.println();
		}

		// Approach 3
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		System.out.println("========================");
		// Approach 4
		for (int i = 0; i < b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}

	}

}