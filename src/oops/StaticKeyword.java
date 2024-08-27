package oops;

public class StaticKeyword {
	static int x;
	static {
		x = 10;
		System.out.println("Static block");
	}

	static void calc() {
		x = x * 2;
	}

	void disp() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println(StaticKeyword.x);
		StaticKeyword.calc();
		StaticKeyword sk = new StaticKeyword();
		sk.disp();
	}
}
