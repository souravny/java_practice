package day15;

class Bank
{

	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 9.5;
	}			
}

public class MethodOverridingDemo {
	
	public static void main(String[] args) 
	{
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
		
		Bank ba=new Bank();
		System.out.println(ba.roi());

	}

}
