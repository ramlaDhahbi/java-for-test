package part1;

public class Calculation {

	int x = 10;
	int y = 20;

	// 1/case-1: Note tacking parameters and also not return any value

	void sum() {

		// body
		System.out.println(x + y);

	}

	// 2/ case-2 : Not tacking parameters but returning value
	int sum1() {

		return (x + y);
	}

	// 3/case-3: Tacking parameters but not returning value

	void sum3(int a, int b) {

		System.out.println(a + b);

	}

	// 4/case-4 :Tacking parameters and also returning value
	int sum4(int a, int b) {

		return (a + b);
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();

		cal.sum();// case1

		int result = cal.sum1();
		System.out.println(result);

		cal.sum3(10, 20);// case 3

		// System.out.println(cal.sum4(10, 20));//case 4

		int result1 = cal.sum4(10, 20);

		System.out.println(result1);

	}

}
