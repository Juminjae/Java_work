package ex01;
import java.util.*;

public class PlayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str1 = {"����","������","�ڹ�","����","�ҳ���","�쵿","����"};
		String word = null;
		
		while (true) {
			System.out.println("���� �ձ� ������ �����մϴ�~~~");
			word = str1[(int)(Math.random()*str1.length)];
			while (true) {
				System.out.printf("%s�� %s(��)�� �����ϴ� �ܾ� >> ", word, word.charAt(word.length()-1));
				String text = scan.next();
				if (word.charAt(word.length() - 1) == text.charAt(0)) {
					word = text;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�");
					break;
				}
			}
			System.out.print("����ϰڽ��ϱ�? >> ");
			String exit = scan.next();		
			if(!exit.equalsIgnoreCase("c")) {
				System.out.println("������ ���� �մϴ�");
				break;
			}	
		}
	}
}