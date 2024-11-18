package streamsAPI.map;

import java.util.Arrays;
import java.util.List;

class Employee {
	int empId;
	String empName;
	int salary;

	public Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
}

public class Demo {

	public static void main(String[] args) {
		List<Employee> employeesList = Arrays.asList(
			    new Employee(101, "Alex", 10000),
			    new Employee(102, "Brian", 20000),
			    new Employee(103, "Charles", 30000),
			    new Employee(104, "David", 40000),
			    new Employee(105, "Edward", 50000)
			);
			employeesList.stream().filter(e -> e.salary > 20000).map(e -> e.salary).forEach(System.out::println);
		
	}

}
