package oops.polymerphism;

public class ConstructorDemo {
	int x, y;

	ConstructorDemo() {
		x = 10;
		y = 20;
	}

	ConstructorDemo(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		cd.sum();

		ConstructorDemo cd1 = new ConstructorDemo(30, 40);
		cd1.sum();
	}

}
