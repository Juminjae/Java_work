//학번 : 20215249 
//이름 : 주민재
// 학기 평균 점수를 계산하는 프로그램

package week05;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computer_basic, c_pro, eng, general_math;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오. : ");
		computer_basic = input.nextInt();
		System.out.print("C언어 프로그래밍 과목의 점수를 입력하시오. : ");
		c_pro = input.nextInt();
		System.out.print("영어 과목의 점수를 입력하시오. : ");
		eng = input.nextInt();
		System.out.print("일반 수학 과목의 점수를 입력하시오. : ");
		general_math = input.nextInt();
		
		average = (computer_basic +c_pro +eng + general_math)/4;
		System.out.print("평균 점수는 " + average + "점 입니다.");
		
	}

}
