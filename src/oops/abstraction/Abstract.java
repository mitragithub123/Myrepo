package oops.abstraction;

abstract class Vehicle {
	void startEngine() {
		System.out.println("Engine started");
	}

	abstract void stopEngine();
}

class Car extends Vehicle {

	@Override
	void stopEngine() {
		System.out.println("Engine stopped");
	}
}

public class Abstract {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startEngine();
		myCar.stopEngine();

	}

}
