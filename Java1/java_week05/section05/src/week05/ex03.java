//학번 : 20215249 
//이름 : 주민재
//관계연산을 수행한 결과를 출력하는 프로그램

package week05;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("첫 번째 수 입력: ");
		x = input.nextInt();
		System.out.print("두 번째 수 입력: ");
		y = input.nextInt();
		
		System.out.format("%d < %d 은 %b \n", x, y, x < y);
		System.out.format("%d > %d 은 %b \n", x, y, x > y);
		System.out.format("%d <= %d 은 %b \n", x, y, x <= y);
		System.out.format("%d >= %d 은 %b \n", x, y, x >= y);
		System.out.format("%d == %d 은 %b \n", x, y, x == y);
		System.out.format("%d != %d 은 %b \n", x, y, x != y);
		System.out.format("!(%d != %d) 은 %b \n", x, y, !(x != y));
		
	}

}
