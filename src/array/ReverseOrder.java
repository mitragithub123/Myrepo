package array;
import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 2 };
		System.out.println("Before reverse....");
		System.out.println(Arrays.toString(a));

		System.out.println("After reverse....");
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]+ " ");
		}

	}

}
