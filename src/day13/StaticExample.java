package day13;

public class StaticExample {
	
	static int a=10;
	int b=1;
	
	void m1() //non-static method can access static and non-static variables directly
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m2() //static method can access only static stufe directly
	{
		System.out.println(a);
		//System.out.println(b); // not valid
	}


}
