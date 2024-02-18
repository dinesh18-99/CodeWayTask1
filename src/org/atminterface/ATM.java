package org.atminterface;
import java.util.*;

public class ATM 
{
	
		
		public static void main(String[] args) 
		{
			Userinterfaceimp userinterfaceimp=new Userinterfaceimp();
			Balance b=new Balance();
			System.out.println("select one option");
			System.out.println("Enter 1 for amountwithdraw");
			System.out.println("Enter 2 for Deposit");
			System.out.println("Enter 3 for Checkbalance");
			System.out.println("Enter 4 for Exit");
			Scanner Scan=new Scanner(System.in);
			int num=Scan.nextInt();
			switch
			(num) {
			case 1:
			{
				System.out.println("enter withdrawamount");
				int withdrawamount=Scan.nextInt();
				if(withdrawamount<=b.getDeposit())
				{
				userinterfaceimp.withdrawing(withdrawamount);
				}
				else
				{
					System.out.println("no sufficient balance");
				}
				
			
			}
			break;
			case 2:
				{
				System.out.println("enter Depositamount");
				int depositamount=Scan.nextInt();
			
				b.setDeposit(depositamount);
				userinterfaceimp.deposit(b.getDeposit());
				}
			break;
			case 3:
				{
					userinterfaceimp.checkbalance();
				
				}
				break;
			case 4:
			{
				System.out.println("Thanks for visting");
			
			}
			break;
			default:
				{
				System.err.println("enter valid option");
				
				
				}
		}
	}
	}
