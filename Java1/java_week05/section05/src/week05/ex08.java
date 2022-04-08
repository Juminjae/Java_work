//학번 : 20215249 
//이름 : 주민재
//입력된 시간이 몇시간 몇분 몇초에 해당하는지를 계산하는 프로그램

package week05;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 0;
		int minute = 0;
		int second = 0;
		int value = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("초단위 시간을 입력하세요:");
		value = input.nextInt();
		second = value % 60 ;
		value = value / 60;
		minute = value % 60;
		hour = value / 60;
		
		System.out.printf( "%d 시간 %d 분 %d초입니다." , hour , minute , second );
	}

}
