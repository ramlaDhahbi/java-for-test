package myPackage;

public class Operations {

	public static void main(String[] args) {
		
		int a = 10;
		int b =20;
		
		//Arithmetic operators : + - % *
		
		System.out.println("--------------------Arethmetic Operators----------------");
		System.out.println("sum of a and b is :" +(a+b));
		System.out.println("Diff of a and b is :" +(a-b));//Without () will do concatination
		
		
		//Relational Operators ===> == , <>, <=,=<,!= ...
		//always return boolean value
		
		System.out.println("--------------------Relational Operators----------------");
		System.out.println(a==b); // false
		System.out.println(a > b);//false
		System.out.println(a!=b);// true
		
		//Logical Operators && || 
		
		System.out.println("--------------------Logical Operators----------------");
		boolean x = true ; //1
		boolean y = false;//0
		System.out.println(x && y);// 1*0
		System.out.println(x || y);//1+0
		System.out.println(! x);
		System.out.println(! y);
		
		//increment /decrement
		
		System.out.println("--------------------increment /decrement----------------");
		
		a = 20 ;
		b = a++ ; //a=a+1 
		System.out.println(a);
		
		b= 10;
		b-- ;//b=10-1
		System.out.println(b);
		
		
		
	}

}
