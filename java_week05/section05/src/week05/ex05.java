//학번 : 20215249 
//이름 : 주민재
//True, False로 값 출력

package week05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i=3 , j=3 , k=5;
			
		System.out.print("( i <= k) && ( i >= j) 조건은 ");
		System.out.println(( i <= k) && ( i >= j));
		System.out.printf("( i < k) || ( k == j) 조건은 ");
		System.out.println(( i < k) || ( k == j));
		System.out.printf("( i != k) && (i + j) < k 조건은 ");
		System.out.println(( i != k) && (i + j) < k );
		
	}

}
