package ex01;
import java.util.*;

public class TextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�.";
		
		System.out.print("���ڸ� �Է��ϼ��� >>>>");
		boolean flag = true;
		char ch = scan.next().charAt(0);
		int index = str.indexOf(ch);
		
		System.out.println("======indexOf() �޼ҵ� ���======");
		if(index == -1) {
			System.out.println("�ش� ���ڰ� �������� �ʽ��ϴ�");
		}
		else {
			System.out.println(ch+" �ε����� "+index+" �Դϴ�");
		}
			
		System.out.println("======charAt() �޼ҵ� ���======");
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				System.out.println(ch+" �ε����� " +i+" �Դϴ�");
				flag=false;
				break;
			} 
		}
		if (flag == true) {
			System.out.println(ch+" �� �ش� ���ڿ��� �����ϴ�");
		}
		System.out.println("���α׷� ����");
	}
}