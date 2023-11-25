package part2;

public class ConstructeurOverloading {

	ConstructeurOverloading(int a, int b) { // 1
		System.out.println(a + b);

	}

	ConstructeurOverloading(double a, double b) { // 2

		System.out.println(a + b);

	}

	ConstructeurOverloading(int a, double b) { // 3

		System.out.println(a + b);

	}

	ConstructeurOverloading(int a, int b, int c) // 4

	{

		System.out.println(a + b + c);

	}

	public static void main(String[] args) {

		// ConstructeurOverloading co = new ConstructeurOverloading(30, 40);//1
		// ConstructeurOverloading co = new ConstructeurOverloading(15.5, 15.5);//2
		// ConstructeurOverloading co = new ConstructeurOverloading(10, 10.5);//3
		ConstructeurOverloading co = new ConstructeurOverloading(10, 10, 10);// 4

	}

}
