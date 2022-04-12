package ex01;
import java.util.Scanner;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		People people = null;
		
		while(flag) {
			System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성 3. 종료 --> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("이름, 사번, 급여를 입력하세요");
				people = new SalariedEmployee(scan.next(), scan.next(), scan.nextInt());
				break;
			case 2:
				System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
				people = new HourEmployee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다");
			}
			System.out.println(people);
		}
		scan.close();
		System.out.println("프로그램을 종료합니다");
	}

}
