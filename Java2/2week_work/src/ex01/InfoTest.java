package ex01;
import java.util.Scanner;

public class InfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� >>> ");
		Info info1 = new Info(scan.next());
	    System.out.println("ù��° ��ü ���� �Ϸ�");
	    
	    System.out.print("���̵� �Է��ϼ��� >>> ");
	    Info info2 = new Info(scan.next());
	    System.out.println("�ι�° ��ü ���� �Ϸ�");
	    System.out.println();
	      
	    System.out.println("ù��° ��ü�� ���̵�� ��й�ȣ ���");
	    info1.display();
	    System.out.println("�ι�° ��ü�� ���̵�� ��й�ȣ ���");
	    info2.display();
	}

}
