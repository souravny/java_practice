package day12;

public class MethodOverloadingDemo {
	int x,y,z;
	double d;
	
	void sum() //1
	{
		x=100;
		y=200;
		
		System.out.println(x+y);
	}
	
	void sum(int a, int b) //2
	{
		x=a;
		y=b;
		
		System.out.println(x+y);
	}
	
	void sum(int a, double b) //3
	{
		x=a;
		d=b;
		
		System.out.println(x+d);
	}
	
	void sum(double a, int b) //4
	{
		d=a;
		x=b;
		
		System.out.println(d+x);
	}
	
	void sum(int a, int b, int c) //5
	{
		x=a;
		y=b;
		z=c;
		
		System.out.println(x+y+z);
	}	

	public static void main(String[] args) 
	{
		MethodOverloadingDemo mo=new MethodOverloadingDemo();
		//mo.sum(); //1
		//mo.sum(900, 800); //2
		//mo.sum(10, 20.5); //3
		//mo.sum(10.5, 40); //4
		mo.sum(100, 200, 300); //5
		

	}

}
