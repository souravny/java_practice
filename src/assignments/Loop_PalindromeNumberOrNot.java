package assignments;

public class Loop_PalindromeNumberOrNot {

	public static void main(String[] args) 
	{
		int num=121;
		int orginal_number=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orginal_number==rev)
		{
			System.out.println("Its a palindrome number");
		}
		else
		{
			System.out.println("Its not a palindrome number");
		}
		
	

	}

}
