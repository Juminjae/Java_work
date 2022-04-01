/*
 학번: 20215249
 이름: 주민재
 프로그램: 두 정수를 짝수인지 홀수인지 판별하는 프로그램
 */

package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		a = input.nextInt();
		
		if (a%2 == 0) {
			System.out.printf("%d는 짝수입니다.", a);
		}
		else {
			System.out.printf("%d는 홀수입니다.", a);
		}
	}
}