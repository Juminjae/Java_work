/*
 �й�: 20215249
 �̸�: �ֹ���
 ���α׷�: �Լ� ����ϴ� ���α׷�
 */

package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, result;
		Scanner input = new Scanner(System.in);
		System.out.print("��갪 x�� �Է��Ͻÿ�: ");
		x = input.nextDouble();
		
		if (x <= 0) {
			result = (x*x*x)-(9*x)+2;
			System.out.printf("�Լ� f(x)�� ����� : %.1f", result);
		}
		else {
			result = (7*x)+2;
			System.out.printf("�Լ� f(x)�� ����� : %.1f", result);
		}
	}

}