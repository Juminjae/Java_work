package ex01;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine bookA = new Magazine("����A", 10, "����A", "2010�� 2�� 25��");
		Magazine bookA_2 = new Magazine("����A", 10, "���ں���", "2010�� 2�� 25��");
		Magazine bookB = new Magazine("����B", 20, "����B", "2010�� 3�� 8��");
		Magazine bookB_2 = new Magazine("����B", 50, "����B", "2010�� 3�� 8��");
		Magazine bookB_3 = new Magazine("����B", 50, "����B", "2020�� 8�� 31��");
		System.out.println(bookA);
		System.out.println();
		System.out.println("----bookA ��ü ���� ���� ��----");
		System.out.println(bookA_2);
		System.out.println();
		System.out.println(bookB);
		System.out.println();
		System.out.println("----bookB ��ü ������ ���� ��----");
		System.out.println(bookB_2);
		System.out.println();
		System.out.println("----bookB ��ü �߸��� ���� ��----");
		System.out.println(bookB_3);
		System.out.println();
	}

}
