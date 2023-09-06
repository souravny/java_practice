package day12;

public class EncapsulationDemo_AccountMain {

	public static void main(String[] args) 
	{
		EncapsulationDemo_Account ea=new EncapsulationDemo_Account();
		ea.setAccno(102030);
		System.out.println(ea.getAccno());
		
		ea.setBalance(90000.80);
		System.out.println(ea.getBalance());
		
		ea.setName("Mark");
		System.out.println(ea.getName());
		
		ea.setBank("Chase");
		System.out.println(ea.getBank());

	}

}
