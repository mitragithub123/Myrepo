package oops;

public class ThisKeyword2 {
	int x, y; // Class variables or, instance variables (Scope with in this class)

	// When instance variables and parameters have the same name, use "this" to refer
	// to the instance variable:
	ThisKeyword2(int x, int y) { // Local variables (Scope with in this constructor)
		this.x = x;
		this.y = y;
		// 'this' is used to distinguish between instance variables and parameters with the same name
		// Class varibles = Local variables
		// Class variable=this.x & x=local variable
	}

	void disp() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyword2 tk = new ThisKeyword2(5, 10);
		tk.disp();
	}

}
