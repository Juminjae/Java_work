package ex01;

import java.util.Scanner;

public class ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("도형의 높이 : ");
		x = input.nextInt();
		System.out.print("도형의 너비 : ");
		y = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j  <= y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
