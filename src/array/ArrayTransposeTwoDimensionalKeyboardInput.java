package array;
import java.util.Scanner;

public class ArrayTransposeTwoDimensionalKeyboardInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the matrices: ");
		int row = sc.nextInt();

		System.out.print("Enter the number of columns for the matrices: ");
		int col = sc.nextInt();

		int matrix[][] = new int[row][col];
		int transposeMatrix[][] = new int[row][col];

		// Scan 1st matrix
		System.out.println("Enter values for the first matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Performing transpose
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		// Print result
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
