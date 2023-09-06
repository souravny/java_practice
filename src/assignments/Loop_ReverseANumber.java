package assignments;

public class Loop_ReverseANumber {

	public static void main(String[] args) 
	{
		int num=12468;
		int reverse=0;
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		
		System.out.println(reverse);
		

	}

}
