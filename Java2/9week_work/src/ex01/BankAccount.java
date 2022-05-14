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
			throw new NegativeBalanceException("�ܰ� = "+(balance - amount));
		} 
		else {
			System.out.printf("��� %d, �ܰ� �����Դϴ�.\n", amount);
		}
	}
}
