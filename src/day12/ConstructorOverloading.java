package day12;

public class ConstructorOverloading {

	int a,b,c;
	double d;
	
	ConstructorOverloading()
	{
		a=100;
		b=20;
		System.out.println(a+b);
	}
	ConstructorOverloading(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	ConstructorOverloading(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverloading co=new ConstructorOverloading(200,200,600);
		ConstructorOverloading co1=new ConstructorOverloading(10,20);
		ConstructorOverloading co2=new ConstructorOverloading();
		

	}

}
