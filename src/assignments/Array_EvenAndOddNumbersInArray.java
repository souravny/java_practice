package assignments;

public class Array_EvenAndOddNumbersInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		
		int even=0;
		int odd=0;
		
		//using classic for loop
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}*/
		
		//using for-each/enhanced for loop
		for(int x:a)
		{
			if(x%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		
		System.out.println("Even numbers: "+even);
		System.out.println("Odd numbers: "+odd);

	}

}
