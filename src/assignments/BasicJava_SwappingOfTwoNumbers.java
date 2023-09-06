package assignments;

public class BasicJava_SwappingOfTwoNumbers {

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		System.out.println("Before swapping a value: "+a);
		System.out.println("Before swapping b value: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping 'a' value: "+a);
		System.out.println("Afetr swapping 'b' value: "+b);

	}

}
