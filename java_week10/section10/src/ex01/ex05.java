package ex01;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, x, y, r;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		a = input.nextInt();
		b = input.nextInt();
		
		x = (a>b)? a:b;
		y = (a>b)? b:a;
		
		while (y != 0 ) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("�� ���� �ִ� �����: %d", x);
	}

}
