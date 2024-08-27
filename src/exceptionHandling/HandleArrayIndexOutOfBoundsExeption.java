package exceptionHandling;

public class HandleArrayIndexOutOfBoundsExeption {
// Thrown when trying to access an array with an illegal index (either negative or greater than the size of the array).
	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			arr[4] = 10;
			System.out.println(arr[4]);
		} catch (Exception e) {
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends...");
	}
}
