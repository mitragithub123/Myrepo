package oops.inheritance;

class Animal2 {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog2 extends Animal2 {
	@Override
	void sound() {
		super.sound(); // Calling the parent class method
		System.out.println("Dog barks");
	}
}

public class Super2 {

	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.sound();
	}

}
