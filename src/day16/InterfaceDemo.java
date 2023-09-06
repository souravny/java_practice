package day16;

interface I1
{
	int a=10;
	
	void m1();
	
	default void m2()
	{
		System.out.println("this is default method of interface I1");
	}
	
	static void m3()
	{
		System.out.println(a);
	}
}

class Test implements I1
{
	public void m1()
	{
		System.out.println("this is from I1 interface implemented here");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1();
		t.m2();
		I1.m3();
		System.out.println(t.a);

	}

}
