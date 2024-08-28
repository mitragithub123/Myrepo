package exceptionHandling;

public class HandleNegativeArraySizeException {
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
