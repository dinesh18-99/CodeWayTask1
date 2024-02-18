package org.atminterface;



public class Userinterfaceimp implements Userinterface
{
	

	@Override
	public void withdrawing(int amount) 
	{
		Balance b=new Balance();
		int withdraw=b.getDeposit()-amount;
		b.setDeposit(withdraw);
		System.out.println("Withdrawal Successfully");
		
		
		
	}

	@Override
	public void deposit(int amount) 
	{
		Balance b=new Balance();
		int dep=b.getDeposit()+amount;
		b.setDeposit(dep);
		System.out.println("Deposit Successfully");
		
	}

	@Override
	public void checkbalance() 
	{
		Balance b=new Balance();
		System.out.println("Balance"+b.getDeposit());
		
		
	}

	
	

}
