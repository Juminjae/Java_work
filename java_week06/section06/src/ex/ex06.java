/*
 학번: 20215249
 이름: 주민재
 프로그램: switch 문을 이용한 프로그램
 */

package ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, menu = 0;
		double result = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하시오. : ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		System.out.println("메뉴");
		System.out.println("1. 작은수");
		System.out.println("2. 큰수");
		System.out.println("3. 합계");
		System.out.println("4. 평균");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하세오: ");
		menu = input.nextInt();
		
		switch ( menu ) {
			case 1: 
				result = ( number1 < number2 ) ? number1 : number2;
				break;
			case 2:
				result = ( number1 > number2) ? number1 : number2;
				break;
			case 3:
				result = number1 + number2;
				break;
			case 4:
				result = (number1 + number2) / 2;
				break;
			case 5:
				System.out.println("종료");
				break;
			default:
				System.out.println("메뉴선택오류");
		}
		if (menu >= 1 && menu <= 4) {
			System.out.println("결과: " + result);
		}
		
	}

}
