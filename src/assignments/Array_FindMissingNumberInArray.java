package assignments;

public class Array_FindMissingNumberInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		for(int i=a[0]; i<=a[a.length-1]; i++)
		{
			sum2=sum2+i;
		}
		
		
		System.out.println("Missing number: "+(sum2-sum1));

	}

}
