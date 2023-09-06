package day19_dataconversion_accessmodifiers;

public class DataConversionDemo {

	public static void main(String[] args) 
	{
		String s1="10.8";
		String s2="100";
		String bol="true";
		
		double d=Double.parseDouble(s1);
		int a=Integer.parseInt(s2);
		System.out.println(Boolean.parseBoolean(bol));
		
		System.out.println(d);
		System.out.println(a);
		
		int x=200;
		
		String s=String.valueOf(x);
		System.out.println(s);
		
		boolean b=true;
		
		String str=String.valueOf(b);
		System.out.println(str);
		
		

	}

}
