package day18_Exceptions;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try 
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invelid data entered");
		}
		
		System.out.println("Program finished");
	}

}
