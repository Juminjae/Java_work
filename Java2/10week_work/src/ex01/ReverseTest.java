package ex01;
import java.util.*;

public class ReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer sb = null;
		
		while(true) {
			System.out.print("���ڿ� �Է�: ");
			String text = scan.next();
			
			if(text.equalsIgnoreCase("finish")) {
				System.out.print("���α׷� ����");
				break;
			}
			sb = new StringBuffer(text);
			System.out.println(text + " => (reverse) " + sb.reverse());
		}
	}
}