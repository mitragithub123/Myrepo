package lambdaExpressions.application1;

@FunctionalInterface
interface Cab6 {
	String bookCab(String source, String destination);
}

public class Test6 {
	public static void main(String[] args) {
		Cab6 ob = (source, destination) -> {
			System.out.println("Ola cab is booked from " + source + " to " + destination);
			return "Price: 6000 Rs.";
		};
		System.out.println(ob.bookCab("Delhi", "Mumbai"));
	}
}
