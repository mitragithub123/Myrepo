package oops;

class A {
	int a;

	void get() {
		a = 10;
	}

	void disp() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	@Override
	void get() {
		b = 20;
	}

	@Override
	void disp() {
		System.out.println(b);
	}
}

class C extends A {
	int c;

	@Override
	void get() {
		c = 30;
	}

	@Override
	void disp() {
		System.out.println(c);
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A ob = new A();
		ob.get();
		ob.disp();

		ob = new B();
		ob.get();
		ob.disp();

		ob = new C();
		ob.get();
		ob.disp();
	}

}
