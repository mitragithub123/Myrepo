package lambdaExpressions.application1;

@FunctionalInterface
interface Cab3 {
	void bookCab(String source, String destination);
}

class Ola3 implements Cab3 {

	public void bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from " + source + " to " + destination);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Cab3 ob = (Cab3) new Ola3();
		ob.bookCab("Delhi", "Mumbai");
	}

}
