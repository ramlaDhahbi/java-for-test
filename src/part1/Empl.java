package part1;

public class Empl {

	int eid;
	String ename;
	double sal;
	int deptno;
	String job;

	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);

	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid = 111;
		emp1.ename = "Marwa";
		emp1.job = "Test Automation";
		emp1.deptno = 15;
		emp1.sal = 80.00;
		emp1.display();

		// creating object 2

		Employee emp2 = new Employee();
		emp2.eid = 112;
		emp2.ename = "Ramla";
		emp2.job = "QA";
		emp2.deptno = 15;
		emp2.sal = 90.00;
		emp2.display();

	}

}
