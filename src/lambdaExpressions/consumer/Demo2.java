package lambdaExpressions.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	String gender;

	public Employee(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();

		emplist.add(new Employee("David", 50000, "Male"));
		emplist.add(new Employee("John", 30000, "Male"));
		emplist.add(new Employee("Mary", 20000, "Female"));
		emplist.add(new Employee("Scott", 60000, "Male"));

		// Function
		Function<Employee, Integer> f = emp -> (emp.salary * 10) / 100; // task1

		// Predicate
		Predicate<Integer> p = b -> b > 5000; // task2

		// Consumer
		Consumer<Employee> c = emp -> {
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		};

		for (Employee e : emplist) {
			int bonus = f.apply(e); // Calculate bonus Invoked Function

			if (p.test(bonus)) { // Invoked Predicate
				c.accept(e); // Invoked Consumer
				System.out.println("Employee bonus: " + bonus);
			}
		}
	}

}
