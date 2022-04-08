/*
 학번: 20215249
 이름: 주민재
 프로그램: 근의 값을 구하는 프로그램
 */

package ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c, D;
		double result = 0, result1 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ax^2 + bx + c = 0의 근을 구하시오.");
		System.out.print("a값을 입력하시오: ");
		a = scan.nextInt();
		System.out.print("b값을 입력하시오: ");
		b = scan.nextInt();
		System.out.print("c값을 입력하시오: ");
		c = scan.nextInt();
		
		D = (b*b)-(4*a*c);
		
		if (D>0) {
			result = (-b+Math.sqrt(D))/(2*a);
			result1 = (-b+Math.sqrt(D))/(2*a);
			System.out.printf("두 근의 값은 %f 와 %f이다.", result, result1);
		} 
		else if (D==0) {
			result = -b/(2*a);
			System.out.printf("두 근의 값은 %f(중근)이다.", result);
		}
		else if (D<0) {
			result = (-b+Math.sqrt(-D))/(2*a);
			result1 = (-b-Math.sqrt(-D))/(2*a);
			System.out.printf("두 근의 값은 %fi와 %fi이다.", result, result1);
		}
	}

}
