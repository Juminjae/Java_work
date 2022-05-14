package ex01;

public class BankAccount {
	private int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	void withdraw(int amount)throws NegativeBalanceException{
		if(amount <= balance) {
			throw new NegativeBalanceException("잔고 = "+(balance - amount));
		} 
		else {
			System.out.printf("출금 %d, 잔고가 음수입니다.\n", amount);
		}
	}
}
