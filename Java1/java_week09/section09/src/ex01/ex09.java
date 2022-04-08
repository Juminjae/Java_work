package ex01;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("크기 입력: ");
		x = scan.nextInt();
		
		for (y = 0; y < x; y++) {
			System.out.printf("[%d]\t", y);
		}
	}

}
