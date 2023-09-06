package day7;

public class SearchingANumberInArray {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,50,40};
		int searching_number=50;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==searching_number)
			{
				flag=true;
				System.out.println("Number found!");
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Number Not found!");
		}

	}

}
