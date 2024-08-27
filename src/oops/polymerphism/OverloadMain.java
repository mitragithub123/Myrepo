package oops.polymerphism;

public class OverloadMain {
	void main(int x) {
		System.out.println(x);
	}

	void main(int x, int y) {
		System.out.println(x + y);
	}

	void main(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		OverloadMain om = new OverloadMain();
		om.main(10);
		om.main(10, 20);
		om.main("Siku");

	}

}
