package week12;

class Account{
	private String AccountNo;
	private String owner;
	private int balance;
	
public String getAccountNo() {
	return AccountNo;
}
public void setAccountNo(String name) {
	AccountNo = name;
}
public String getOwner() {
	return owner;
}
public void setOwner(String own) {
	owner = own;
}
public int getBalance() {
	return balance;
}
public void setBalance(int a) {
	balance = a;
}
public String toString() {
	String str = "���¹�ȣ: ";
	str += AccountNo;
	str += "\n������: ";
	str += owner;
	str += "\n�ܾ�: ";
	str += balance;
	return str;
}
public void deposit(int b) {
	if (b>=0)
		balance += b;
	else
		System.out.print("���̳ʽ� �ݾ��� �Աݵ��� �ʽ��ϴ�.");
}
public void withdraw(int c) {
	if (c<0)
		System.out.print("���̳ʽ� �ݾ��� ������� �ʽ��ϴ�.");
	else if (c>balance)
		System.out.print("\n�ܾ��� �����մϴ�.");
	else
		balance -= c;
}

}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account usr1 = new Account();
		usr1.setAccountNo("111-222-333333");
		usr1.setOwner("ȫ�浿");
		usr1.setBalance(1000000);
		usr1.deposit(300000);
		usr1.withdraw(500000);
		
		Account usr2 = new Account();
		usr2.setAccountNo("444-555-666666");
		usr2.setOwner("�̼���");
		usr2.setBalance(2000000);
		usr2.deposit(500000);
		usr2.withdraw(700000);
		
		System.out.println("usr1�� ���� ���� : "+ usr1.toString());
		System.out.println("usr2�� ���� ���� : "+ usr2.toString());
	}

}
