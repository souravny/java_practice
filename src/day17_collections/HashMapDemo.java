package day17_collections;

import java.util.HashMap;


public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap mymap=new HashMap();
		
		mymap.put(1, "Jhon");
		mymap.put(2, "David");
		mymap.put(3, "Marry");
		mymap.put(4, "Scoot");
		
		
		System.out.println(mymap.size());
		System.out.println(mymap);
		
		System.out.println(mymap.keySet());
		
		System.out.println(mymap.get(4));
		mymap.remove(2);
		System.out.println(mymap);
		
		for(Object x:mymap.keySet().toArray())
		{
			System.out.println(mymap.get(x));
		}
		
		
		

	}

}
