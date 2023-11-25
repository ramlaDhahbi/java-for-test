package part1;

public class ConstructorDemo {

	int x;
	int y;

	// Default constructor

	ConstructorDemo() {

		x = 10;
		y = 20;

	}

	// Parameterized constructor

	ConstructorDemo(int a, int b) {
		x = a;
		y = b;

	}

	void display() {

		System.out.println(x + y);
	}

	public static void main(String[] args) {

//		ConstructorDemo cd= new ConstructorDemo(); // invoke default constructor
//		
//		cd.display();

		ConstructorDemo cd = new ConstructorDemo(100, 200);
		cd.display();

		// if calling the 2 constructor
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(100, 200);
		cd1.display();
		cd2.display();

	}

}
