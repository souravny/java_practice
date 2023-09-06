package misc;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAnArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			System.out.println("enter "+ i +"value");
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
		sc.close();

	}

}
