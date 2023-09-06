package java_programs;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		float tem=sc.nextInt();
		
		tem=((tem-32)*5)/9;
		
		System.out.println("Temperature in Celsius: "+tem);
		sc.close();
		

	}

}
