package ex01;
import java.util.*;

public class PlayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str1 = {"오이","강아지","자바","생강","소나기","우동","연어"};
		String word = null;
		
		while (true) {
			System.out.println("끝말 잇기 게임을 시작합니다~~~");
			word = str1[(int)(Math.random()*str1.length)];
			while (true) {
				System.out.printf("%s의 %s(으)로 시작하는 단어 >> ", word, word.charAt(word.length()-1));
				String text = scan.next();
				if (word.charAt(word.length() - 1) == text.charAt(0)) {
					word = text;
				} else {
					System.out.println("틀렸습니다");
					break;
				}
			}
			System.out.print("계속하겠습니까? >> ");
			String exit = scan.next();		
			if(!exit.equalsIgnoreCase("c")) {
				System.out.println("게임을 종료 합니다");
				break;
			}	
		}
	}
}