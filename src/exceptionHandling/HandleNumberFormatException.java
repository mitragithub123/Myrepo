package exceptionHandling;

public class HandleNumberFormatException {
// Thrown when an attempt to convert a string to a numeric type fails
	public static void main(String[] args) {
		String str = "Welcome";
		try {
			int x = Integer.parseInt(str);
			System.out.println(x);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends...");

	}

}
