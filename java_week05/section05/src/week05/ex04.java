//학번 : 20215249 
//이름 : 주민재
//수를 입력받아 두 수중 큰 값을 출력하는 프로그램

package week05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		x = input.nextInt();
		System.out.print("두 번째 수 입력: ");
		y = input.nextInt();
		
		z = (x > y) ? x : y;
		System.out.print("큰 수는 "+ z + "입니다.");
	}

}
