//학번 : 20215249 
//이름 : 주민재
//10000보다 작은 정수를 입력받아서 천, 백, 십, 일의자리로 분리하여 출력하는 프로그램

package week05;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, N_1000, N_100, N_10, N_1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		number = input.nextInt();
		
		N_1000 = number / 1000;
		number %= 1000;
		N_100 = number / 100;
		number %= 100;
		N_10 = number / 10;
		number %= 10;
		N_1 = number;
		System.out.printf("\n천의 자리 : %d", N_1000);
		System.out.printf("\n백의 자리 : %d", N_100);
		System.out.printf("\n십의 자리 : %d", N_10);
		System.out.printf("\n일의 자리 : %d", N_1);
	}

}
