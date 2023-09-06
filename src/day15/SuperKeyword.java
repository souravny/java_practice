package day15;

class Animal
{
	int a=10;
	
	void m1()
	{
		
		System.out.println(a);
	}
}

class Dog extends Animal
{
	int b=20;
	void m1()
	{
		super.m1();
		System.out.println(b);
	}
	
}

public class SuperKeyword {	

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.m1();
	
	}

}
