package ex01;
import java.util.Scanner;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		People people = null;
		
		while(flag) {
			System.out.print("1: Salaried ��ü ����, 2: Hour ��ü ���� 3. ���� --> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("�̸�, ���, �޿��� �Է��ϼ���");
				people = new SalariedEmployee(scan.next(), scan.next(), scan.nextInt());
				break;
			case 2:
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ���");
				people = new HourEmployee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
			}
			System.out.println(people);
		}
		scan.close();
		System.out.println("���α׷��� �����մϴ�");
	}

}
