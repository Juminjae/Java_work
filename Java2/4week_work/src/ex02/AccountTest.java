package ex02;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount i = new CheckingAccount("111-22-3333", "ȫ�浿", 100000, "55-66-77-88");
		CheckingAccount i2 = new CheckingAccount("111-22-3333", "ȫ�浿", 200000, "55-66-77-88");
		CheckingAccount i3 = new CheckingAccount("111-22-3333", "ȫ�浿", 160000, "55-66-77-88");
	
		System.out.println(">>���� ��<<");
		System.out.println(i);
		System.out.println(">>���� ��<<");
		System.out.println(i2);
		System.out.println(">>����ī�� ��� ��<<");
		System.out.println(i3);
	}

}
