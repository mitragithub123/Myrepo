package exceptionHandling;

public class HandleNullPointerException {
// Thrown when an application attempts to use null in a case where an object is required (e.g., calling a method on a null object).
	public static void main(String[] args) {
		String str = null;
		try {
			int x = str.length();
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program ends...");

	}

}
