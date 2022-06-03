package ex01;
import java.util.*;

public class repeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String text = scan.next();
		System.out.print("문자 입력: ");
		char text2 = scan.next().charAt(0);
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == text2) {
				n++;
			}
		}
		System.out.printf("%s 문자열에서 %s 문자는 %d번 반복됩니다.\n", text, text2,n);
		System.out.println("프로그램 종료");
	}
}
