/*
 �й�: 20215249
 �̸�: �ֹ���
 ���α׷�: ���� ���� ���ϴ� ���α׷�
 */

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c, D;
		double result = 0, result1 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ax^2 + bx + c = 0�� ���� ���Ͻÿ�.");
		System.out.print("a���� �Է��Ͻÿ�: ");
		a = scan.nextInt();
		System.out.print("b���� �Է��Ͻÿ�: ");
		b = scan.nextInt();
		System.out.print("c���� �Է��Ͻÿ�: ");
		c = scan.nextInt();
		
		D = (b*b)-(4*a*c);
		
		if (D>0) {
			result = (-b+Math.sqrt(D))/(2*a);
			result1 = (-b+Math.sqrt(D))/(2*a);
			System.out.printf("�� ���� ���� %f �� %f�̴�.", result, result1);
		} 
		else if (D==0) {
			result = -b/(2*a);
			System.out.printf("�� ���� ���� %f(�߱�)�̴�.", result);
		}
		else if (D<0) {
			result = (-b+Math.sqrt(-D))/(2*a);
			result1 = (-b-Math.sqrt(-D))/(2*a);
			System.out.printf("�� ���� ���� %fi�� %fi�̴�.", result, result1);
		}
	}

}
