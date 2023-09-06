package assignments;

public class Loop_NumberOfDigitsInANumber {

	public static void main(String[] args) 
	{
		int num=657657;
		int no_of_digits=0;
		
		while(num>0)
		{
			num=num/10;
			no_of_digits++;
			
		}
		System.out.println(no_of_digits);

	}

}
