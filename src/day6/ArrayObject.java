package day6;

import java.util.Arrays;

public class ArrayObject {

	public static void main(String[] args) 
	{
		Object a[]=new Object[5];
		a[0]=100;
		a[1]="welcome";
		a[2]=true;
		a[3]=15.90;
		a[4]='A';
		
		
		for(Object x:a)
		{
			System.out.println(x);
		}
		
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[2]);

	}

}
