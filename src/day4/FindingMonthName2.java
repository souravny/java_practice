package day4;

public class FindingMonthName2 {

	public static void main(String[] args) {
		
		int monthno=12;
		
		if(monthno>=1 && monthno<=12)
		{
		if(monthno==1)
		{
			System.out.println("January");
		}
		else if(monthno==2)
		{
			System.out.println("Fabruary");
		}
		else if(monthno==3)
		{
			System.out.println("March");
		}
		else if(monthno==4)
		{
			System.out.println("April");
		}
		else if(monthno==5)
		{
			System.out.println("May");
		}
		else if(monthno==6)
		{
			System.out.println("June");
		}
		else if(monthno==7)
		{
			System.out.println("July");
		}
		else if(monthno==8)
		{
			System.out.println("August");
		}
		else if(monthno==9)
		{
			System.out.println("September");
		}
		else if(monthno==10)
		{
			System.out.println("October");
		}
		else if(monthno==11)
		{
			System.out.println("November");
		}
		else
		{
			System.out.println("December");
		}
		}
		
		else
		{
			System.out.println("Invelid Month Number");
		}
		
	}

}
