package ex01;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BankAccount = new BankAccount();
		BankAccount.deposit(100);
		System.out.println("ภ๚รเ "+BankAccount.getBalance()+", ภÜฐํ = "+BankAccount.getBalance());
		BankAccount.deposit(500);
		System.out.println("ภ๚รเ "+BankAccount.getBalance()+", ภÜฐํ = "+BankAccount.getBalance());
	
		try {
			BankAccount.withdraw(800);
			System.out.println(BankAccount.getBalance());
		} catch (NegativeBalanceException ex){
			ex.printStackTrace();
		}
	}
}