package day2;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		
		int a=25;
		int b=3;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		int x=4;
		
		x+=5;
		System.out.println(x);
		
		int res=++x;
		System.out.println(res);
		
		x*=2;
		System.out.println(x);
		
		
		String y=(10<12)? "a":"b";
		System.out.println(y);
		
		

	}

}
