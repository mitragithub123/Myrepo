package oops.inheritance;

class Animal3 {
	String name = "Animal";

	void display() {
		System.out.println("Animal name: " + name);
	}
}

class Dog3 extends Animal3 {
	String name = "Dog";

	void display() {
		System.out.println("Dog name: " + name);
		System.out.println("Animal name: " + super.name); // Accessing parent class field
	}
}

public class Super3 {

	public static void main(String[] args) {
		Dog3 dog = new Dog3();
		dog.display();
	}

}
