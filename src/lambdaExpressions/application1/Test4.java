package lambdaExpressions.application1;

@FunctionalInterface
interface Cab4 {
	void bookCab(String source, String destination);
}

public class Test4 {
	public static void main(String[] args) {
		Cab4 ob = (source, destination) -> System.out
				.println("Ola cab is booked from " + source + " to " + destination);
		ob.bookCab("Delhi", "Mumbai");
	}

}
