package oops.inheritance;

class Abc{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class Xyz extends Abc{
	void m1(int a) {
		System.out.println(a*a); // Overriding
	}
	
	void m2(int a, int b) {
		System.out.println(a+b); // Overloading
	}
}
public class OverloadVsOverride {

	public static void main(String[] args) {
		Xyz xyz = new Xyz();
		xyz.m1(20);	
		xyz.m2(20, 30);	
	}

}
