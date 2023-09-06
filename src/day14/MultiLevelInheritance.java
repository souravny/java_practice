package day14;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	void show(int a)
	{
		System.out.println(a);
	}
}

class Child2 extends Child1
{
	void print(int a)
	{
		System.out.println(a);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Child2 cobj2=new Child2();
		cobj2.display(1000);
		cobj2.show(2000);
		cobj2.print(3000);
		
		Child1 cobj1=new Child1();
		cobj1.display(1);
		cobj1.show(2);

	}

}
