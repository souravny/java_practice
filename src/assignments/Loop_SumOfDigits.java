package assignments;

public class Loop_SumOfDigits {

	public static void main(String[] args) 
	{
		int num=571375;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits: "+sum);

	}

}
