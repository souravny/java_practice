package assignments;

public class Array_SearchingElementsInArray {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,50,60,70};
		int search_ele=40;
		boolean flag=false;
		
		//using classic for loop
		/*for(int i=0; i<arr.length; i++)
		{
			if(search_ele==arr[i])
			{
				flag=true;
				System.out.println("Element found.");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found.");
		}*/
		
		//using enhanced for loop
		for(int x:arr)
		{
			if(search_ele==x)
			{
				flag=true;
				System.out.println("Element found.");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found.");
		}
		

	}

}
