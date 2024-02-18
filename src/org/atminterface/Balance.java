package org.atminterface;

public class Balance
{
	
		private int deposit=1000;
		
		public int getDeposit() {
			return deposit;
		}

		public void setDeposit(int deposit) {
			this.deposit = deposit;
		}

		@Override
		public String toString() 
		{
			return "Balance [deposit=" + deposit + "]";
		}
		

	}

