package week08;

public class cardexample {
	public static void main(String args[]) {
		creditcard cc = new creditcard();
		cc.cardnumber = 1234_5678_1233_2345L;
		cc.owner = "kim";
		System.out.println("카드번호 : " + cc.cardnumber);
		System.out.println("카드소유자: " + cc.owner);
	}
}