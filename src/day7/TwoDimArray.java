package day7;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		int a[][]=new int[4][4];
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;
		
		a[2][0]=90;
		a[2][1]=100;
		a[2][2]=110;
		a[2][3]=120;
		
		a[3][0]=130;
		a[3][1]=140;
		a[3][2]=150;
		a[3][3]=160;
		
		System.out.println("Number of rows: "+a.length);
		System.out.println("Number of columns: "+a[0].length);
		
		int sum=0;
		for(int i[]:a)
		{
			for(int x:i)
			{
				System.out.print(x+"  ");
				
			}
			System.out.println();
		}

	}

}
