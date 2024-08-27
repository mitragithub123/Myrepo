package oops.inheritance;

class Bank {
	double roi() {
		return 0;
	}
}

class Icici extends Bank {
	double roi() {
		return 100.25;
	}
}

class Sbi extends Bank {
	double roi() {
		return 10.75;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Icici icici = new Icici();
		System.out.println(icici.roi());

		Sbi sbi = new Sbi();
		System.out.println(sbi.roi());
	}

}
