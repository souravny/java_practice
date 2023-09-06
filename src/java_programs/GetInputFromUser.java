package java_programs;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("You entered: "+num);
		
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println("You entered: "+str);
		
		System.out.println("Enter a floting value");
		float f=sc.nextFloat();
		System.out.println("You entered: "+f);
		
		sc.close(); //close Scanner object

	}

}
