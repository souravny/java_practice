package day12;

import java.util.Arrays;

public class OverloadMainMethod {
	
	
	void main()
	{
		System.out.println("This is main method with out parameters");
	}
	
	void main(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void main(int a[])
	{
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		OverloadMainMethod om=new OverloadMainMethod();
		om.main();
		
		om.main(200, 100);
		
		int arr[]= {1,2,3,4};
		om.main(arr);
	
		

	}

}
