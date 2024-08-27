package array;
public class ArrayAdditionOneDimensional {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3 };
		int array2[] = { 4, 5, 6, 7 };

		int minLength = Math.min(array1.length, array2.length);
		int resArray[] = new int[minLength];

		for (int i = 0; i < minLength; i++) {
			resArray[i] = array1[i] + array2[i];
		}

		for (int i = 0; i < resArray.length; i++) {
			System.out.println(resArray[i] + " ");
		}
	}
}
