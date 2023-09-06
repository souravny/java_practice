package day14;

class X
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Y extends X
{
	void show(int a)
	{
		System.out.println(a);
	}
}

class Z extends X
{
	void print(int a)
	{
		System.out.println(a);
	}
}

public class HierarchiInheritance {

	public static void main(String[] args) 
	{
		Y yobj=new Y();
		yobj.display(1);
		yobj.show(2);
		
		Z zobj=new Z();
		zobj.display(10);
		zobj.print(20);
		
		X xobj=new X();
		xobj.display(100);

	}

}
