package ex01;
import java.util.Scanner;

public class InfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 >>> ");
		Info info1 = new Info(scan.next());
	    System.out.println("첫번째 객체 생성 완료");
	    
	    System.out.print("아이디를 입력하세요 >>> ");
	    Info info2 = new Info(scan.next());
	    System.out.println("두번째 객체 생성 완료");
	    System.out.println();
	      
	    System.out.println("첫번째 객체의 아이디와 비밀번호 출력");
	    info1.display();
	    System.out.println("두번째 객체의 아이디와 비밀번호 출력");
	    info2.display();
	}

}
