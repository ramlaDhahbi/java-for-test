package part2;

public class ThisKeyword {

	int a, b;

	/*
	 * void getValues(int x , int y) {
	 * 
	 * a=x; b=y;
	 * 
	 * }
	 */
	void getValues(int x, int y) {

		this.a = a;
		this.b = b;

	}

	void printvalues() {

		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword();
		tk.getValues(20, 30);
		tk.printvalues();

	}

}
