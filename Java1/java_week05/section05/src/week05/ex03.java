//�й� : 20215249 
//�̸� : �ֹ���
//���迬���� ������ ����� ����ϴ� ���α׷�

package week05;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("ù ��° �� �Է�: ");
		x = input.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		y = input.nextInt();
		
		System.out.format("%d < %d �� %b \n", x, y, x < y);
		System.out.format("%d > %d �� %b \n", x, y, x > y);
		System.out.format("%d <= %d �� %b \n", x, y, x <= y);
		System.out.format("%d >= %d �� %b \n", x, y, x >= y);
		System.out.format("%d == %d �� %b \n", x, y, x == y);
		System.out.format("%d != %d �� %b \n", x, y, x != y);
		System.out.format("!(%d != %d) �� %b \n", x, y, !(x != y));
		
	}

}