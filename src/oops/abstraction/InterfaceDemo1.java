package oops.abstraction;

interface Rafale {
	void fly();
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

	}

}
