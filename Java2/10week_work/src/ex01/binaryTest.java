package ex01;
import java.util.*;

public class binaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", 
				"0110", "0111", "1000", "1001", "1010", "1011", 
				"1100", "1101", "1110", "1111"};
		Scanner scan = new Scanner(System.in);
		String text = "";
		
		while(true) {
			System.out.println("16������ �Է��ϼ���");
			System.out.print("�ݺ����� �����Ϸ��� s �Ǵ� S�� �Է��ϼ��� : ");
			text = scan.next();
			if(text.equalsIgnoreCase("s")) {
				break;
			}
			for(int i = 0; i<text.length(); i++) {
				try {
					System.out.print(hexa2bin[Integer.parseInt(text.charAt(i)+"",16)]+" ");
				} catch(Exception ex) {
					System.out.print("---- ");
				}
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}