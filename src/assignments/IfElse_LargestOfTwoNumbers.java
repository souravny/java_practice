package assignments;

public class IfElse_LargestOfTwoNumbers {

	public static void main(String[] args) 
	{
		int num1=30;
		int num2=200;
		
		//approach1.. using if else statements
		/*if(num1>num2)
		{
			System.out.println("Largest number is: "+num1);
		}
		else
		{
			System.out.println("Largest number is: "+num2);
		}*/
		
		//approach2..using ternary
		int largest=(num1>num2) ? num1:num2;
		
		System.out.println("Largest number is:"+largest);

	}

}
