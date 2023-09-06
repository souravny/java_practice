package day5;


public class WhileLoop {

	public static void main(String[] args) {
		
	int num=24695189;
	int count=0;
	int revnum=0;
	
		while(num!=0)
		{
		
		revnum=num%10;
		num=num/10;
		if(revnum%2==0)
		{
			count++;
			}
		}
		System.out.println(count);
		}
		
		
		

	}


