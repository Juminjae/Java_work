package ex01;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		while (sum <= 500) {
			System.out.print("������ ���� �Է��ϼ���: ");
			i =scan.nextInt();
			
			if (i == 0) {
				break;
			}
			sum = i + sum;
			System.out.printf("��������� �������� %d�Դϴ�.\n", sum);
		}
		System.out.printf("�� �������� %d�Դϴ�", sum);
		
	}

}
