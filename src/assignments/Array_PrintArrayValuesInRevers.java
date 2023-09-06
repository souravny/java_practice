package assignments;

import java.util.Arrays;

public class Array_PrintArrayValuesInRevers {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
