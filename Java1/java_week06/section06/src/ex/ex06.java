/*
 �й�: 20215249
 �̸�: �ֹ���
 ���α׷�: switch ���� �̿��� ���α׷�
 */

package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, menu = 0;
		double result = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��Ͻÿ�. : ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		System.out.println("�޴�");
		System.out.println("1. ������");
		System.out.println("2. ū��");
		System.out.println("3. �հ�");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.println("�޴��� �����ϼ���: ");
		menu = input.nextInt();
		
		switch ( menu ) {
			case 1: 
				result = ( number1 < number2 ) ? number1 : number2;
				break;
			case 2:
				result = ( number1 > number2) ? number1 : number2;
				break;
			case 3:
				result = number1 + number2;
				break;
			case 4:
				result = (number1 + number2) / 2;
				break;
			case 5:
				System.out.println("����");
				break;
			default:
				System.out.println("�޴����ÿ���");
		}
		if (menu >= 1 && menu <= 4) {
			System.out.println("���: " + result);
		}
		
	}

}