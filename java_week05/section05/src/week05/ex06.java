//학번 : 20215249 
//이름 : 주민재
//관계연산과 논리연산으로 결과를 출력하는 프로그램

package week05;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, computer, eng, math, absence, leap, num;
		char married, gender;
		double total, average;
		
		married = 'Y';
		gender = 'M';
		age = 26;
		computer = 80;
		eng = 90;
		math = 65;
		leap = 2020;
		absence = 3;
		num = 15;
		
		total = computer + eng + math;
		average = total / 3.0;
		
		System.out.print("1. 미혼인가: " + (married == 'Y'));
		System.out.print("\n2. 나이가 19세 이상이고 남자인가:" + (age >= 19 && gender == 'M'));
		System.out.print("\n3. 컴퓨터와 영어 그리고 수학 모두가 90점 이상인가: " + (computer>=90 && eng>=90 && math>=90));
		System.out.print("\n4. 총점이 200점 이상이거나 평균이 60점 이싱인가: " + (total >= 200  || average >= 60));
		System.out.print("\n5. 점수가 60점 미만이거나 결석횟수가 4번 이상인가: " + (total <= 60 || absence >= 4));
		System.out.print("\n6. 현재의 년도가 윤년인가: " + (leap == 2020));
		System.out.print("\n7. 입력된 숫자가 짝수인가: " + (num == 15));
		System.out.print("\n8. 입력된 숫자가 3과 5의 공배수인가: " + (num == 15));
	}

}
