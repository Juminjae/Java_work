package ex01;

public class ex01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<= 4; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int j = 9-2*i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
