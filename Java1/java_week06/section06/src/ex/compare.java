/*
 학번: 20215249
 이름: 주민재
 프로그램: 두 정수를 비교하는 프로그램
 */

package ex;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 점수 입력(정수): ");
		a = input.nextInt();
		System.out.print("두 번째 점수 입력(정수): ");
		b = input.nextInt();
	
		if(a>b) {
			System.out.printf("첫 번째 정수 %d 가 두 번째 정수 %d 보다 크다", a, b);
		}
		else if(b>a) {
			System.out.printf("첫 번째 정수 %d 가 두 번째 정수 %d 보다 작다", a, b);
		}
		else
			System.out.printf("첫 번째 정수 %d 와 두 번째 정수 %d 가 같다", a, b);
	}

}
