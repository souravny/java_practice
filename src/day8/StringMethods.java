package day8;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		//length()
		String name="welcome";
		System.out.println(name.length());
		
		//concat()
		String s1="welcome";
		String s2="to java";
		System.out.println(s1.concat(s2));
		
		//charAt()
		String s="automation";
		System.out.println(s.charAt(4));
		
		//trim()
		s="   new york    ";
		System.out.println(s.trim());
		
		//contains()
		s="java automation";
		System.out.println(s.contains("va au"));
		
		//substring()
		System.out.println(s.substring(0, 7));
		
		//equals() & equalsIgnorCase()
		s1="welcome";
		s2="Welcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//toUpperCase() toLowerCase()
		
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		//split()
		s="world@gmail.com";
		
		String x[]=s.split("@");
		System.out.println(x[0]);
		System.out.println(x[1]);
		

	}

}
