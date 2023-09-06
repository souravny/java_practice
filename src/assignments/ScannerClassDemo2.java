package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClassDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[3];
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println("Enter "+i+"value: ");
			num[i]=sc.nextInt();
			
		}
		sc.close();
		
		System.out.println(Arrays.toString(num));
		
		

	}

}
