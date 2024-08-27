package exceptionHandling;

public class NegativeArraySizeException {
// This exception occurs if you try to create an array with a negative size
	public static void main(String[] args) {
		try {
			int[] arr = new int[-4];
		} catch (Exception e) {
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends...");
	}

}
