package day6;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a[3]);
		
		System.out.println(a.length);
		
		System.out.println(Arrays.toString(a));
		
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
