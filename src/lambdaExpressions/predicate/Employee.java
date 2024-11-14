package lambdaExpressions.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
	String ename;
	int salary;
	int experience;

	public Employee(String ename, int salary, int experience) {
		this.ename = ename;
		this.salary = salary;
		this.experience = experience;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("John", 20000, 3);
		// Salary>30000 && Experience>3
		Predicate<Employee> p = e -> (e.salary > 30000 && e.experience > 3);
		System.out.println(p.test(employee));

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Scott", 10000, 2));
		list.add(new Employee("Nina", 20000, 3));
		list.add(new Employee("Rhea", 30000, 4));
		list.add(new Employee("Adam", 40000, 5));
		list.add(new Employee("Lary", 50000, 6));
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e.ename + " " + e.salary);
			}
		}
	}

}
