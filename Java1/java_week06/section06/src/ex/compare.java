/*
 �й�: 20215249
 �̸�: �ֹ���
 ���α׷�: �� ������ ���ϴ� ���α׷�
 */

package ex;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է�(����): ");
		a = input.nextInt();
		System.out.print("�� ��° ���� �Է�(����): ");
		b = input.nextInt();
	
		if(a>b) {
			System.out.printf("ù ��° ���� %d �� �� ��° ���� %d ���� ũ��", a, b);
		}
		else if(b>a) {
			System.out.printf("ù ��° ���� %d �� �� ��° ���� %d ���� �۴�", a, b);
		}
		else
			System.out.printf("ù ��° ���� %d �� �� ��° ���� %d �� ����", a, b);
	}

}