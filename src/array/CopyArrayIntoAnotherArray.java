package array;

import java.util.Arrays;

public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int copiedArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copiedArr[i] = arr[i];
		}
		System.out.println("Original Array: " + Arrays.toString(arr));

	}

}
