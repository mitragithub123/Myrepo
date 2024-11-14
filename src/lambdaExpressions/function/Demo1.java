package lambdaExpressions.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("David", 50000));
		al.add(new Employee("John", 40000));
		al.add(new Employee("Mary", 30000));

		Function<Employee, Integer> fne = e -> {
			int sal = e.salary;

			if (sal >= 10000 && sal <= 20000)
				return (sal * 10 / 100);
			else if (sal > 20000 && sal <= 30000)
				return (sal * 20 / 100);
			else if (sal > 30000 && sal <= 50000)
				return (sal * 30 / 100);
			else
				return (sal * 40 / 100);
		};

		Predicate<Integer> p = b -> b > 5000;

		for (Employee emp : al) {
			int bonus = fne.apply(emp);
			if (p.test(bonus)) {
				System.out.println(emp.name + " " + emp.salary);
				System.out.println("Bonus is: " + bonus);
			}
		}

	}

}
