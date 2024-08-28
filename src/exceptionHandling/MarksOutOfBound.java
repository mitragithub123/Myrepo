package exceptionHandling;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
	MarksOutOfBoundException(String msg) {
		super(msg);
	}
}

public class MarksOutOfBound {

	public static void main(String[] args) {
		int maxMark = 100;
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter mark for student " + (i + 1) + ": ");
			int mark = sc.nextInt();
			try {
				if (mark > maxMark) {
					throw new MarksOutOfBoundException(
							"Mark " + mark + " exceeds the maximum allowed mark of " + maxMark);
				} else {
					marks[i] = mark; // Store the mark only if it is valid
				}
			} catch (MarksOutOfBoundException e) {
				System.out.println(e.getMessage());
				i--; // Retry for the same student
			}
		}
		sc.close();
		System.out.println("Marks entered successfully.");

	}

}
