package array;
import java.util.Arrays;

public class ObjectArray {
	public static void main(String[] args) {

		Object a[] = { 100, 10.5, 'C', "Siku" };
		Object b[] = { 20, 30.5, 'X', "Riku" };

		// Using for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Using for each loop
		for (Object x : b) {
			System.out.println(x);
		}

		// Approach 3
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}