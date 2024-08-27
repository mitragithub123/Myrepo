package pattern.number;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows..");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();

	}

}
