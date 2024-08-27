package oops.abstraction;

interface Rafale {
	int length = 1000; // final & static
	int breadth = 2000; // final & static

	void fly(); // abstract method

	default void maxSpeed() {
		System.out.println("Sukhoi is speeding");
	}

	static void minSpeed() {
		System.out.println("Sukhoi is less speeding");
	}
}

interface Sukhoi extends Rafale {
	void flip();
}

class FighterPlane implements Sukhoi {
	@Override
	public void fly() {
		System.out.println("Sukhoi is flying");
	}

	@Override
	public void flip() {
		System.out.println("Sukhoi is flipping");
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		FighterPlane fp = new FighterPlane();
		fp.fly();
		fp.flip();

		Rafale rf = new FighterPlane();
		rf.maxSpeed();
		Rafale.minSpeed();
		
		System.out.println(Rafale.length*Rafale.breadth);

	}

}
