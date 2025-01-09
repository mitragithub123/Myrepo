package others;

public class DisplayASCII {

	public static void main(String[] args) {
		String str = "Test sutomation central";
		for (char c : str.toCharArray()) {
			System.out.println("ASCII value of " + c + " is: " + (int) c);

		}
	}
}
