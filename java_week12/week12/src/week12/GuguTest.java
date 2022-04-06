package week12;

import java.util.Scanner;

class Gugu{
	private int dan;
	
	public void printGugu() {
		System.out.printf("해당하는 단: %d\n\n", dan);
		for(int i = 1; i <= 9; i++) {
		System.out.printf("%d*%d = %d\n", dan, i, (dan*i));
		}
	}

	public void setDan(int a) {
		dan = a;
	}
}

public class GuguTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Dan;
		Scanner input = new Scanner(System.in);
		
		Gugu dan2 = new Gugu();
		System.out.print("단수 입력: ");
		Dan = input.nextInt();
		dan2.setDan(Dan);
		dan2.printGugu();
	}

}
