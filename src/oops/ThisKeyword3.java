package oops;

public class ThisKeyword3 {
	int x, y;

	void disp() {
		System.out.println(x);
	}

	void show() {
		System.out.println(y);
		this.disp(); // It's used to explicitly indicate that disp() belongs to the current object.
		// Accessing the Current Class's Methods
	}

	public static void main(String[] args) {
		ThisKeyword3 tk = new ThisKeyword3();
		tk.show();
	}

}
