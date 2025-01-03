package array;

import java.util.Arrays;

public class ArraySecondMaxMin {

	public static void main(String[] args) {
		int[] numbers = { 12, 34, 5, 7, 89, 45 };
		Arrays.sort(numbers);
		System.out.println("Numbers after sorting: " + Arrays.toString(numbers));
		int secondMin = numbers[1];
		int secondMax = numbers[numbers.length - 2];
		System.out.println("Second Minimum: " + secondMin);
		System.out.println("Second Maximum: " + secondMax);
	}

}
