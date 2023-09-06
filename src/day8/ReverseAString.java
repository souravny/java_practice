package day8;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) 
	{
		//Approach1
		/*String s="welcome to java";
		String rev="";
		int len=s.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev); //avaj ot emoclew*/
		
		//Approach2
		/*String s="welcome to QA Automation";
		String rev="";
		int len=s.length();
		char a[]=s.toCharArray();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println(a); //welcome to QA Automation
		System.out.println(rev); //noitamotuA AQ ot emoclew*/
		
		//Approach3
		/*StringBuilder s=new StringBuilder("welcome to the world");
		System.out.println(s.reverse()); //dlrow eht ot emoclew*/
		
		//Approach4
		StringBuffer s=new StringBuffer("dlrow eht ot emoclew");
		System.out.println(s.reverse());//welcome to the world
		
		
		
		

	}

}
