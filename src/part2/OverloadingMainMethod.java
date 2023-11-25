package part2;

public class OverloadingMainMethod {

	// multiple main method

	public void main(int x) {
		System.out.println(x);

	}

	public void main(int x, int y)

	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		OverloadingMainMethod omm = new OverloadingMainMethod();
		omm.main(10);
		omm.main(10, 20);

	}

}
