package assignments;

import java.util.Arrays;


public class Array_SortingArrayUsingBuiltInMethods {

	public static void main(String[] args) 
	{
		int a[]= {30,10,90,20,50,70};
		
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		//approach 1
		/*Arrays.sort(a);
		System.out.println("After sorting: "+Arrays.toString(a));*/
		
		//approach 2
		Arrays.parallelSort(a);
		System.out.println("After sorting: "+Arrays.toString(a));
		
		

	}

}
