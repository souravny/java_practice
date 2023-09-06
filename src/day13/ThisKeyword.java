package day13;

public class ThisKeyword {
	
	int x,y;
	
	void m1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		ThisKeyword th=new ThisKeyword();
		th.m1(100,200);
		th.display();
		

	}

}
