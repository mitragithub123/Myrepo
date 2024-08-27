package exceptionHandling;

public class ArrayIndexOutOfBoundsExeption {
// Thrown when trying to access an array with an illegal index (either negative or greater than the size of the array).
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[4] = 10;
		System.out.println(arr[4]);
		System.out.println("Program ends...");
	}
}
