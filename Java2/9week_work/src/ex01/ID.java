package ex01;
import java.util.Scanner;

public class ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		message = scan.next();
		
		try {
			if(message.length() >= 8 && Character.isAlphabetic(message.charAt(0))) {
				System.out.println(message+"�� ��� ������ ���̵� �Դϴ�.");	
			}else {
				throw new NotUseId(message);
			}
		} catch (NotUseId ex) {
			System.out.println(ex.getMessage());
		}
	}
}