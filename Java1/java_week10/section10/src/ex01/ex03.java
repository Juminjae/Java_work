package ex01;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력 최대값 입력: ");
		x = input.nextInt();
		System.out.printf("소수: ");
		for(int i = 1; i <= x; i++) {
			int count=0;
			for(int j = i; j >= 1; j--) {
				if(i%j == 0)
					count++;
			}
				if(count>2 || count == 1) continue;
				System.out.printf("%4d", i);
		}
	}

}
