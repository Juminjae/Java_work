//�й� : 20215249 
//�̸� : �ֹ���
//���� �Է¹޾� �� ���� ū ���� ����ϴ� ���α׷�

package week05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է�: ");
		x = input.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		y = input.nextInt();
		
		z = (x > y) ? x : y;
		System.out.print("ū ���� "+ z + "�Դϴ�.");
	}

}
