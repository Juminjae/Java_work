/*
 학번: 20215249
 이름: 주민재
 프로그램: 함수 계산하는 프로그램
 */

package ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, result;
		Scanner input = new Scanner(System.in);
		System.out.print("계산값 x를 입력하시오: ");
		x = input.nextDouble();
		
		if (x <= 0) {
			result = (x*x*x)-(9*x)+2;
			System.out.printf("함수 f(x)의 결과는 : %.1f", result);
		}
		else {
			result = (7*x)+2;
			System.out.printf("함수 f(x)의 결과는 : %.1f", result);
		}
	}

}
