package day17_collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) 
	{
	
		HashSet myset=new HashSet();
		
		myset.add("Welcome");
		myset.add(100);
		myset.add(50.50);
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		System.out.println(myset.size());
		
		myset.remove(50.50);
		System.out.println(myset);
		
		myset.clear();
		System.out.println(myset);

	}

}
