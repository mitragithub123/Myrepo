package lambdaExpressions.application1;

@FunctionalInterface
interface Cab1 {
	void bookCab();
}

public class Test2 {
	public static void main(String[] args) {
		Cab1 ob = () -> System.out.println("Ola cab");
		ob.bookCab();
	}

}
