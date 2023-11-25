package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s ="Welcome" ;
		
		String s1 = "to java" ;
		
		//length of a string 
		System.out.println(s.length());
		
		//joining of a string 
		s ="                          Welcome" ;
		System.out.println("Before trimming string s is " +s);
		
		
		//Remove space
		System.out.println("After trimming string s is " +s.trim());
		
		//chartA
		s= "Welcome" ;
		System.out.println(s.charAt(3));
		
		//contains ==> return boolean 
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("com"));
		
		//comparing string equals
		s = "welcome" ;
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("wel   come"));

		//Replacing characters
		
		s="Welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium"));
		
		//converting case
		s ="WELCOME" ;
		System.out.println(s.toLowerCase());
		
		s ="welcome" ;
		System.out.println(s.toUpperCase());
		


	}

}
