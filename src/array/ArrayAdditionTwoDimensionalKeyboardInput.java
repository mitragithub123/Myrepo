package array;
import java.util.Scanner;

public class ArrayAdditionTwoDimensionalKeyboardInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the matrices: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns for the matrices: ");
		int cols = sc.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] res = new int[rows][cols];

		// Input values for the first matrix
		System.out.println("Enter values for the first matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		// Input values for the second matrix
		System.out.println("Enter values for the second matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		// Add matrices
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print result
		System.out.println("Result of matrix addition:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

		// Close the scanner
		sc.close();
	}
}
