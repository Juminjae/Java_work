package ex01;
import java.util.*;

public class TextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "자바 프로그램은 재미 없습니다. 어렵습니다.";
		
		System.out.print("문자를 입력하세요 >>>>");
		boolean flag = true;
		char ch = scan.next().charAt(0);
		int index = str.indexOf(ch);
		
		System.out.println("======indexOf() 메소드 사용======");
		if(index == -1) {
			System.out.println("해당 문자가 존재하지 않습니다");
		}
		else {
			System.out.println(ch+" 인덱스는 "+index+" 입니다");
		}
			
		System.out.println("======charAt() 메소드 사용======");
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				System.out.println(ch+" 인덱스는 " +i+" 입니다");
				flag=false;
				break;
			} 
		}
		if (flag == true) {
			System.out.println(ch+" 는 해당 문자열에 없습니다");
		}
		System.out.println("프로그램 종료");
	}
}