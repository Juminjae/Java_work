package ex01;
import java.util.*;

public class Answer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manage manage = new Manage();
		manage.splitString(new String[] { "������ȣ", "���ýĺ���ȣ", "������ ��ȣ" }, "082-2-777-5566");
		manage.startChar();
		System.out.println("34 + 56 - 12 * 2 = " + manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("���α׷� ����");
	}
}

class Manage{
	public void splitString(String[] strings, String string) {
		// TODO Auto-generated method stub
		String str = "082-2-777-5566";
		StringTokenizer token = new StringTokenizer(str, "-");
		System.out.println("������ȣ: "+token.nextToken());
		System.out.println("���ýĺ���ȣ: "+token.nextToken());
		System.out.println("������ ��ȣ: "+token.nextToken()+" "+token.nextToken());
	}

	public void startChar() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			char ranalpha = (char) (Math.random()*26+'A');
			System.out.print(ranalpha+ "�� �����ϴ� �ܾ�>> ");
			scan.next();
		}
		scan.close();
	}
	
	public int calChar(String string) {
		// TODO Auto-generated method stub
		return (34 + 56 - 12) * 2;
	}		
}
