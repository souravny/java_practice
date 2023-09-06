package day8;

public class StringMethods2 {

	public static void main(String[] args) 
	{
		/*String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true*/
		
		/*String s1=new String("welcome");
		String s2=new String("welcome");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true*/
		
		/*String s="welcome";
		
		String s1=s.concat(" to java");
		System.out.println(s1); //welcome to java
		System.out.println(s.concat(" to java")); //welcome to java*/
		
		//string immutability
		String s=new String("welcome");
		s.concat(" to java");
		System.out.println(s); //welcome
		
		//string mutability
		StringBuffer strb=new StringBuffer("welcome");
		strb.append(" to java");
		System.out.println(strb); //welcome to java
		
		StringBuilder stbu=new StringBuilder("Welcome");
		stbu.append(" to java");
		System.out.println(stbu); //Welcome to java
		
		
		

	}

}
