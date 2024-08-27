package array;
import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {
	public static void main(String[] args) {
		/* Declaring array */

		// Approach 1
		int a[] = new int[5]; // int[] a=new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		// Approach 2
		int b[] = { 1, 2, 3, 4, 5 };

		// Approach 2-Dynamic array creation
		int c[];
		c = new int[2];
		c[0] = 10;
		c[1] = 30;

		// Find length of an array
		System.out.println("Length of array a is: " + a.length);
		System.out.println("Length of array b is: " + b.length);
		System.out.println("Length of array c is: " + c.length);

		// Read single value from an array
		System.out.println(a[3]);
		System.out.println(b[2]);
		System.out.println(c[0]);

		/* Reading all the values from an array */

		// Approach 1-Using for loop
		for (int i = 0; i < a.length; i++) { // or use i<=a.length-1
			System.out.print(a[i] + "  ");
		}

		// Approach 2-Using enhanced for loop (for...each loop)
		/*
		 * for (int x : c) { System.out.print(x + "  "); }
		 */

		// Approach 3
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		// Take input
		String arr[] = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 strings..");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	}
}
