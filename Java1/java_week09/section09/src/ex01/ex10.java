package ex01;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, x, y;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("??: ");
		i = scan.nextInt();
		System.out.printf("??: ");
		j = scan.nextInt();
		
		for (x = 0; x < i; x++) {
			for (y = 0; y < j; y++) {
				System.out.printf("[%d][%d] ", x,y);
			}
			System.out.println();
		}
	}

}
