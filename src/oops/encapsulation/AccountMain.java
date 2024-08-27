package oops.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccNo(1201202023);
		System.out.println(acc.getAccNo());

		acc.setName("Mitra bhanu Prusty");
		System.out.println(acc.getName());
	}

}
