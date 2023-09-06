package day13;

public class StaticMain {

	public static void main(String[] args) 
	{
		
			//StaticExample.m2();
			StaticExample se=new StaticExample();
			//se.m1();
			System.out.println(se.a);
			System.out.println(se.b=90);
			
			StaticExample se1=new StaticExample();
			
			System.out.println(se1.a);
			System.out.println(se1.b);

	}

}
