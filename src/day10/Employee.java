package day10;

public class Employee 
{

	int empid;
	String ename;
	int sal;
	
	Employee(int empid, String name, int salary)
	{
		this.empid=empid;
		ename=name;
		sal=salary;
	}
	
	void setData(int id, String name, int salary) 
	{
		empid=id;
		ename=name;
		sal=salary;
	}
	
	void display() 
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(sal);
	
	}
	
	public static void main(String args[])
	{
		Employee emp=new Employee(301, "Mary", 80000);
		
		/*emp.empid=101;
		emp.ename="David";
		emp.sal=90000;*/
		
		emp.display();
		emp.setData(101, "Mark", 70000);
		emp.display();
		
	}
	
}
