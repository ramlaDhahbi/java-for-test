package part1;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student stu1 = new Student (1102,"Ramla",'A');
		
		//1 Assign values to variables by using reference variable
		
//		stu1.sid =100;
//		stu1.sname ="Ramla";
//		stu1.grade ='A' ;
//		stu1.display();
		
		
		//2 Assign values to variables by using method
	     
		stu1.getvalue(101, "Ali", 'A');
		stu1.display();

		//2 Assign values to variables by using constructor
		stu1.display();
	}
	
	
}
