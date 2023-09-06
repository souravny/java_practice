package day7;

public class SingleDimArray {

	public static void main(String[] args) 
	{
		int a[]= {10,40,20,30,80};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.println("Total value: "+sum);

	}

}
