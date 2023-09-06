package day17_collections;

import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList mylist=new ArrayList();
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add('A');
		mylist.add("welcome");
		mylist.add(null);
		mylist.add(null);
		
		
		System.out.println(mylist.size());
		System.out.println(mylist);
		Object a=mylist.get(2);
		System.out.println(a);
		mylist.remove(2);
		System.out.println(mylist);
		System.out.println(mylist);
		
		for(Object x:mylist.toArray())
		{
			System.out.println(x);
		}
		
		

	}

}
