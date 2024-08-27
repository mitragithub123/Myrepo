package oops;

public class Employee {
	int eid;
	String ename;
	String job;
	int sal;

	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid = 001;
		emp1.ename = "Siku";
		emp1.job = "QA";
		emp1.sal = 1000;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.eid = 002;
		emp2.ename = "Riku";
		emp2.job = "Teacher";
		emp2.sal = 2000;
		emp2.display();

	}

}
