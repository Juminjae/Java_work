//학번 : 20215249 
//이름 : 주민재
//키와 몸무게를 입력받아 표준체중과 비만도 계산하는 프로그램

package week05;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, weight;
		double nomal_weight, obese_rate;
		Scanner h_input = new Scanner(System.in);
		Scanner w_input = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		height = h_input.nextInt();
		System.out.print("몸무게를 입력하시오: ");
		weight = w_input.nextInt();
		
		nomal_weight = (height - 100) * 0.9;
		obese_rate = (weight-nomal_weight)/nomal_weight * 100;
		
		System.out.println("표준체중은 " +  nomal_weight + "입니다." );
		System.out.print("비만도는 " + obese_rate + "입니다.");
	}

}
