package oops.inheritance;

class Animal1 {
	String name;

	Animal1(String name) {
		this.name = name;
		System.out.println("Animal constructor called");
	}
}

class Dog1 extends Animal1 {
	Dog1(String name) {
		super(name); // Calling the parent class constructor
		System.out.println("Dog constructor called");
	}
}

public class Super1 {

	public static void main(String[] args) {
		Dog1 dog = new Dog1("Buddy");
		System.out.println("Dog's name: " + dog.name);
	}

}
