package day12;

public class EncapsulationDemo_Account {
	
	private int accno;
	private double balance;
	private String name;
	private String bank;
	
	public int getAccno() 
	{
		return accno;
	}
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getBank() 
	{
		return bank;
	}
	public void setBank(String bank) 
	{
		this.bank = bank;
	}

}
