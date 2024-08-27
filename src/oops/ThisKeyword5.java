package oops;

class Department {
	void printEmployee(ThisKeyword5 emp) {
		System.out.println("Employee Name: " + emp.getName());
	}
}

public class ThisKeyword5 {
	private String name;

	ThisKeyword5(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	// Passing the Current Object as a Parameter
	public void sendToDepartment(Department dept) {
		dept.printEmployee(this); // Passes the current object to the Department
	}

	public static void main(String[] args) {
		ThisKeyword5 tk = new ThisKeyword5("David");
		Department dept = new Department();
		tk.sendToDepartment(dept);

	}

}
