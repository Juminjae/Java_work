package ex01;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}

}
