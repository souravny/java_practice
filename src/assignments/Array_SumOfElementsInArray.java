package assignments;

public class Array_SumOfElementsInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		//using classic for loop
		/*for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of elements: "+sum);*/
		
		//using enhanced for loop
		for(int x:a)
		{
			sum=sum+x;
		}
		
		System.out.println("Sum of elements: "+sum);

	}

}
