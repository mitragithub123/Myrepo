package array;
import java.util.Scanner;

public class ArrayMultiplicationTwoDimensionalKeyboardInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the first matrix: ");
		int row1 = sc.nextInt();

		System.out.print("Enter the number of columns for the first matrix: ");
		int col1 = sc.nextInt();

		System.out.print("Enter the number of rows for the second matrix: ");
		int row2 = sc.nextInt();

		System.out.print("Enter the number of columns for the second matrix: ");
		int col2 = sc.nextInt();

		int matrix1[][] = new int[row1][col1];
		int matrix2[][] = new int[row2][col2];
		int[][] res = new int[row1][col2];

		// Check if multiplication is possible
		if (col1 != row2) {
			System.out.println(
					"Error: Number of columns in the first matrix must equal the number of rows in the second matrix.");
			sc.close();
			return;
		}

		// Scan 1st matrix
		System.out.println("Enter values for the first matrix:");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		// Scan 2nd matrix
		System.out.println("Enter values for the 2nd matrix:");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		// Multiply 2 matrix
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				res[i][j] = 0;
				for (int k = 0; k < col1; k++) { // or k < rows2, since cols1 == rows2
					res[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		// Print result
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
