package array;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 2 };
		System.out.println("Before sort....");
		System.out.println(Arrays.toString(a));

		Arrays.sort(a); // Ascending Sort elements in an array

		System.out.println("After sort....");
		System.out.println(Arrays.toString(a));

	}

}
