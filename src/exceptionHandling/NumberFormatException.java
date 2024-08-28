package exceptionHandling;

public class NumberFormatException {
// Thrown when an attempt to convert a string to a numeric type fails
	public static void main(String[] args) {
		String str = "Welcome";
		int x = Integer.parseInt(str);
		System.out.println(x);
		System.out.println("Program ends...");

	}

}
