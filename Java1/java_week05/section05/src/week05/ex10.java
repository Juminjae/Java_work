//�й� : 20215249 
//�̸� : �ֹ���
// �б� ��� ������ ����ϴ� ���α׷�

package week05;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer_basic, c_pro, eng, general_math;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ǻ�� ���� ������ ������ �Է��Ͻÿ�. : ");
		computer_basic = input.nextInt();
		System.out.print("C��� ���α׷��� ������ ������ �Է��Ͻÿ�. : ");
		c_pro = input.nextInt();
		System.out.print("���� ������ ������ �Է��Ͻÿ�. : ");
		eng = input.nextInt();
		System.out.print("�Ϲ� ���� ������ ������ �Է��Ͻÿ�. : ");
		general_math = input.nextInt();
		
		average = (computer_basic +c_pro +eng + general_math)/4;
		System.out.print("��� ������ " + average + "�� �Դϴ�.");
		
	}

}