package day5;

public class JumpingStatementsContinue {

	public static void main(String[] args) 
	{
		//print 1-10 without 6
		
		
		for(int i=1; i<=10; i++)
		{
			if(i==6 || i==4 || i==8)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
