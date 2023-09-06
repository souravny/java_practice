package day7;

import java.util.Collections;
import java.util.Arrays;


public class SortingElementsInDesOrder {

	public static void main(String[] args) 
	{
		Integer a[]= {1,4,6,3,9,2,5,7};
		
		Arrays.sort(a,(Collections.reverseOrder()));
		
		//Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
