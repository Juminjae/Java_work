/*
 �й�: 20215249
 �̸�: �ֹ���
 ���α׷�: �񸸵��� �����ϴ� ���α׷�
 */

package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, weight;
		double normal_weight, obese;
		Scanner input  = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		height = input.nextInt();
		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		weight = input.nextInt();
		normal_weight = (height - 100) * 0.9;
		obese = (weight-normal_weight) / normal_weight * 100;
		
		if (obese < 20) {
			System.out.print("�񸸵��� �����Դϴ�.");
		}
		else if(obese < 30) {
			System.out.print("�񸸵��� �浵���Դϴ�.");
		}
		else if(obese < 50) {
			System.out.print("�񸸵��� �ߵ���Դϴ�.");
		}
		else {
			System.out.print("�񸸵��� �������Դϴ�.");	
		}
	}

}