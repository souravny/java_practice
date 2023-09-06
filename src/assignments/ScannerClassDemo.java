package assignments;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter 1st value:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd value:");
		int num2=sc.nextInt();
		
		sc.close();
		
		System.out.println("Sum of two value is: "+ (num1+num2));

	}

}
