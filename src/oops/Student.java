package oops;

public class Student {
	int sid;
	String sname;
	char grade;

	void printStudentData() {
		System.out.println(sid + " " + sname + " " + grade + " ");
	}

	void setStudentData(int id, String name, char gr) {
		sid = id;
		sname = name;
		grade = gr;
	}

	/*
	 * Student(int id, String name, char gr) { 
	 sid = id;
	 sname = name;
	 grade = gr;
	   }
	 */

	public static void main(String[] args) {

		// By using object reference variable
		Student stud = new Student();
		stud.sid = 001;
		stud.sname = "Siku";
		stud.grade = 'E';
		stud.printStudentData();

		// By using method
		stud.setStudentData(002, "Riku", 'A');
		stud.printStudentData();
		
		// By using constructor
		/*
		 * Student stud=new Student(003, "Fuku", 'A');
		  stud.printStudentData();
		 */
	}

}
