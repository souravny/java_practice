package day4;

public class SmallestOfThreeNumber {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int num3=30;
		
		if(num1>num2 && num1>num3) 
		{
			System.out.println("Largest Number is: "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Largest Number is: "+num2);
		}
		else
		{
			System.out.println("Largest Number is: "+num3);
		}

	}

}
