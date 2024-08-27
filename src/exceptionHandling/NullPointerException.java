package exceptionHandling;

public class NullPointerException {
// Thrown when an application attempts to use null in a case where an object is required (e.g., calling a method on a null object).
	public static void main(String[] args) {
		String str = null;
		int x = str.length();
		System.out.println(x);
		System.out.println("Program ends...");

	}

}
