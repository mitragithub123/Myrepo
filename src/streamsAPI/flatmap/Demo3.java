package streamsAPI.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	String sname;
	int sid;
	char grade;

	public Student(String sname, int sid, char grade) {
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student("Smith", 101, 'A'));
		studentList1.add(new Student("John", 102, 'B'));
		studentList1.add(new Student("Kenedy", 103, 'C'));

		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(new Student("Scott", 104, 'A'));
		studentList2.add(new Student("Mary", 102, 'B'));
		studentList2.add(new Student("Kitty", 103, 'C'));

		List<List<Student>> finaList = Arrays.asList(studentList1, studentList2);
		finaList.stream().flatMap(s -> s.stream()).map(s -> s.sname).forEach(System.out::println);

	}

}
