package lambdaExpressions.application1;

@FunctionalInterface
interface Cab {
	void bookCab();
}

class Ola implements Cab {

	@Override
	public void bookCab() {
		System.out.println("Ola cab");
	}
}

public class Test {
	public static void main(String[] args) {
		Ola ob = new Ola();
		ob.bookCab();
	}

}
