package ex01;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class ProcessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String text = scan.nextLine();
		StringTokenizer st = new StringTokenizer(text," ");
		int countTokens = st.countTokens();
		String[] s = new String[countTokens];
		int i=0;
		while(st.hasMoreTokens()) {
			s[i] = st.nextToken();
			i++;
		}
		System.out.println("���� �� ���:");
		System.out.println(text);
		System.out.println("���� �� ���:");
		Arrays.sort(s);
		for(int j =0; j<s.length; j++) {
			System.out.print(s[j]+" ");
		}
	}
}