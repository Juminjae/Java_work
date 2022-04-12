package ex02;

public class Account {
	public String Accnum, name;
	public int money;
	
	public Account(String Accnum, String name, int money) {
		this.Accnum=Accnum;
		this.name=name;
		this.money=money;
	}
	
	public Account(String Accnum, String name) {
		this.Accnum=Accnum;
		this.name=name;
	}
	
	public void deposit(int amount) {
		money += amount;
	}
	
	public int withdraw(int amount) {
		if (money < amount) {
			return 0;
		}
		money -= amount;
		return amount;
	}

	public String getAccnum() {
		return Accnum;
	}

	public void setAccnum(String accnum) {
		Accnum = accnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "���¹�ȣ: " + Accnum + "\n������: " + name + " \n�ܾ�: " + money ;
	}
}
	
class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount(String Accnum, String name, int money, String cardNo) {
		super(Accnum, name, money);
		this.cardNo=cardNo;
	}
	
	public int pay(String cardNo, int amount) {
		if(!cardNo.equals(this.cardNo) || (money < amount))
			System.out.print("���� �Ұ�");
		return withdraw(amount);
	}
	
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str+="\nī���ȣ: " + cardNo ;
		return str;
	}	
}
