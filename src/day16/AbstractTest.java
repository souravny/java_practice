package day16;

abstract class A
{
	
	final int x=10;
	abstract void m1();
	
	void m2()
	{
		System.out.println("testing...");
	}
	
	
}

class B extends A
{
	void m1()
	{
		
		System.out.println("welcome");
	}

}



public class AbstractTest {

	public static void main(String[] args) 
	{
		B b=new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
	

	}

}
