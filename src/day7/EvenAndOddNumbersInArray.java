package day7;

public class EvenAndOddNumbersInArray {
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int even_number=0;
		int odd_number=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even_number++;
			}
			else 
			{
				odd_number++;	
			}
		}
		System.out.println("Even numbers: "+even_number);
		System.out.println("Odd numbers: "+odd_number);
	}

}
