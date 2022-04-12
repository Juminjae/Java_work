package ex02;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount i = new CheckingAccount("111-22-3333", "홍길동", 100000, "55-66-77-88");
		CheckingAccount i2 = new CheckingAccount("111-22-3333", "홍길동", 200000, "55-66-77-88");
		CheckingAccount i3 = new CheckingAccount("111-22-3333", "홍길동", 160000, "55-66-77-88");
	
		System.out.println(">>예금 전<<");
		System.out.println(i);
		System.out.println(">>예금 후<<");
		System.out.println(i2);
		System.out.println(">>직불카드 사용 후<<");
		System.out.println(i3);
	}

}
