package exceptionHandling;

public class NegativeArraySizeException {
	// This exception occurs if you try to create an array with a negative size
		public static void main(String[] args) {
			int[] arr = new int[-4];
			System.out.println("Program ends...");
		}
}
