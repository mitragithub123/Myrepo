package oops;

public class ThisKeyword4 {
	private String name;
	private int age;

	ThisKeyword4 setName(String name) {
		this.name = name;
		return this; // "this" can be used to return the current instance of the class from a method.
	}

	ThisKeyword4 setAge(int age) {
		this.age = age;
		return this;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		ThisKeyword4 tk = new ThisKeyword4();
		tk.setName("Siku").setAge(29).display(); // // Method chaining
		
	}

}
