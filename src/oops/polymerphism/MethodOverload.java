package oops.polymerphism;

public class MethodOverload {

	int a = 10, b = 20;

	// Method name should be same
	void sum() {
		System.out.println(a + b);
	}

	// No of parameters should be different
	void sum(int x, int y) {
		System.out.println(x + y);
	}

	// Datatypes of parameters should be different
	void sum(int x, double y) {
		System.out.println(x + y);
	}

	// Order of parameters should be different
	void sum(double x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		MethodOverload mo = new MethodOverload();
		mo.sum();
		mo.sum(10, 30);
		mo.sum(10, 7.2);
		mo.sum(2.5, 7);
	}

}
