package array;
public class DuplicatesInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 2 };
		int numToCheckDuplicate = 2;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == numToCheckDuplicate) {
				count++;
			}
		}
		System.out.println("Number of duplicate of" + " " + numToCheckDuplicate + " " + "is: " + count);

	}

}
