//�й� : 20215249 
//�̸� : �ֹ���
//10000���� ���� ������ �Է¹޾Ƽ� õ, ��, ��, �����ڸ��� �и��Ͽ� ����ϴ� ���α׷�

package week05;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, N_1000, N_100, N_10, N_1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		number = input.nextInt();
		
		N_1000 = number / 1000;
		number %= 1000;
		N_100 = number / 100;
		number %= 100;
		N_10 = number / 10;
		number %= 10;
		N_1 = number;
		System.out.printf("\nõ�� �ڸ� : %d", N_1000);
		System.out.printf("\n���� �ڸ� : %d", N_100);
		System.out.printf("\n���� �ڸ� : %d", N_10);
		System.out.printf("\n���� �ڸ� : %d", N_1);
	}

}
