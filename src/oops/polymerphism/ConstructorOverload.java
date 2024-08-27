package oops.polymerphism;

public class ConstructorOverload {

	double a, b;

	// Method name should be same
	ConstructorOverload() {
		a = 10;
		b = 20;
	}

	// No of parameters should be different
	ConstructorOverload(int x, int y) {
		a = x;
		b = y;
	}

	// Datatypes of parameters should be different
	ConstructorOverload(double x, int y) {
		a = x;
		b = y;
	}

	// Order of parameters should be different
	ConstructorOverload(int x, double y) {
		a = x;
		b = y;
	}

	void sum() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		ConstructorOverload mo1 = new ConstructorOverload();
		mo1.sum();

		ConstructorOverload mo2 = new ConstructorOverload(2, 3);
		mo2.sum();

		ConstructorOverload mo3 = new ConstructorOverload(7.5, 3);
		mo3.sum();

		ConstructorOverload mo4 = new ConstructorOverload(7, 3.5);
		mo4.sum();

	}

}
