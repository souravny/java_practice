package assignments;

import java.util.Arrays;
import java.util.Collections;

public class Array_SortingArrayInReversOrder {

	public static void main(String[] args) 
	{
		Integer a[]= {10,20,50,30,90,60};
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("After sorting: "+ Arrays.toString(a));

	}

}
