package ex01;
	
import java.util.Scanner;
	
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Ǻ���ġ ������ ������ ���� �Է��Ͻÿ�: ");
		x = input.nextInt();
		System.out.print("�Ǻ���ġ ����: ");
		
		for (int i = 0; i < x; i++) {
			if(i < 2) {
				System.out.print(i + ", ");
				continue;
			}
			y = a + b;
				System.out.print(y + ", ");
				a=b;
				b=y;
		}
	
	}

}