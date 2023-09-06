package assignments;

public class Loop_NoOfEvenAndOddDigits {

	public static void main(String[] args) 
	{
		int num=156375;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		System.out.println("Even digits: "+even);
		System.out.println("Odd digits: "+odd);

	}

}
