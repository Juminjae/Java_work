package ex01;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine bookA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
		Magazine bookA_2 = new Magazine("잡지A", 10, "기자변경", "2010년 2월 25일");
		Magazine bookB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
		Magazine bookB_2 = new Magazine("잡지B", 50, "기자B", "2010년 3월 8일");
		Magazine bookB_3 = new Magazine("잡지B", 50, "기자B", "2020년 8월 31일");
		System.out.println(bookA);
		System.out.println();
		System.out.println("----bookA 객체 저자 변경 후----");
		System.out.println(bookA_2);
		System.out.println();
		System.out.println(bookB);
		System.out.println();
		System.out.println("----bookB 객체 페이지 변경 후----");
		System.out.println(bookB_2);
		System.out.println();
		System.out.println("----bookB 객체 발매일 변경 후----");
		System.out.println(bookB_3);
		System.out.println();
	}

}
