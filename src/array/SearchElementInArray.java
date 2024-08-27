package array;
public class SearchElementInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int elementToSearch = 20;
		boolean isFound = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elementToSearch) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println(elementToSearch + " " + "is found;");
		} else {
			System.out.println(elementToSearch + " " + "is not found;");
		}

	}

}
