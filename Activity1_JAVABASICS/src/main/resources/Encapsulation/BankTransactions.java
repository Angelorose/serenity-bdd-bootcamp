package Encapsulation;

public class BankTransactions {
	public int iBalance;

	public  int checkBalance() {
		return iBalance;
	}
	public void depositMoney(int iMoney) {
		{iBalance += iMoney;
	}
		

		}


	public void openAccount(int iMoney) {
		this.iBalance = iMoney;
		
	}
}