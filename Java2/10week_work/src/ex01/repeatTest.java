package ex01;
import java.util.*;

public class repeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String text = scan.next();
		System.out.print("���� �Է�: ");
		char text2 = scan.next().charAt(0);
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == text2) {
				n++;
			}
		}
		System.out.printf("%s ���ڿ����� %s ���ڴ� %d�� �ݺ��˴ϴ�.\n", text, text2,n);
		System.out.println("���α׷� ����");
	}
}
