//�й� : 20215249 
//�̸� : �ֹ���
//�Էµ� �ð��� ��ð� ��� ���ʿ� �ش��ϴ����� ����ϴ� ���α׷�

package week05;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 0;
		int minute = 0;
		int second = 0;
		int value = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ʴ��� �ð��� �Է��ϼ���:");
		value = input.nextInt();
		second = value % 60 ;
		value = value / 60;
		minute = value % 60;
		hour = value / 60;
		
		System.out.printf( "%d �ð� %d �� %d���Դϴ�." , hour , minute , second );
	}

}
