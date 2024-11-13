package lambdaExpressions.application1;

@FunctionalInterface
interface Cab5 {
	String bookCab(String source, String destination);
}

class Ola5 implements Cab5 {

	public String bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from " + source + " to " + destination);
		return "Price: 5000 Rs.";
	}
}

public class Test5 {
	public static void main(String[] args) {
		Cab5 ob = (Cab5) new Ola5();
		System.out.println(ob.bookCab("Delhi", "Mumbai"));
	}

}
