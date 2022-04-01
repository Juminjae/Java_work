/*
 학번: 20215249
 이름: 주민재
 프로그램: 비만도를 측정하는 프로그램
 */

package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, weight;
		double normal_weight, obese;
		Scanner input  = new Scanner(System.in);
		System.out.print("키를 입력하시오: ");
		height = input.nextInt();
		System.out.print("몸무게를 입력하시오: ");
		weight = input.nextInt();
		normal_weight = (height - 100) * 0.9;
		obese = (weight-normal_weight) / normal_weight * 100;
		
		if (obese < 20) {
			System.out.print("비만도는 정상입니다.");
		}
		else if(obese < 30) {
			System.out.print("비만도는 경도비만입니다.");
		}
		else if(obese < 50) {
			System.out.print("비만도는 중등도비만입니다.");
		}
		else {
			System.out.print("비만도는 고도비만입니다.");	
		}
	}

}
