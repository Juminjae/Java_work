package ex01;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단을 입력하세요: ");
		x =scan.nextInt();
		
		for (y = 1; y <= 9; y++) {
			System.out.printf("%d * %d = %d\n", x, y, x*y);
		}
	}

}
