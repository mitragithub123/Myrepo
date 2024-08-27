package oops.polymerphism;

public class Greetings {
	// No param-No return value
	void m1() {
		System.out.println("Hello...");
	}

	// No param-Return value
	String m2() {
		return "Hello, how are you??";
	}

	// Takes param-No return value
	void m3(String name) {
		System.out.println("Hello " + name);
	}

	// Takes param-Return value
	String m4(String name) {
		return "Hiii " + name;
	}

	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.m1();

		String msg = gr.m2();
		System.out.println(msg);

		gr.m3("Sriram");

		String msg1 = gr.m4("Hanuman");
		System.out.println(msg1);

	}

}
