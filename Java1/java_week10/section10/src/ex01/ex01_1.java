package ex01;

import java.util.Scanner;

public class ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		x = input.nextInt();
		System.out.print("������ �ʺ� : ");
		y = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j  <= y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
