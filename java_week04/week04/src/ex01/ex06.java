/* 프로그램명 : ex06.java
프로그램 설명 : 변수의 이동(SWAP)
프로그램 작성일 : 2021.03.24
프로그램 최종수정일 : 2021.03.24
프로그램 작성자 : 주민재
*/
package ex01;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 7;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x:" + x + ", y:" + y);
		
		
	}

}
