package ex01;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		System.out.println("1)");
		for (i = 0; i <= 5; i++) {
			for (j = 1; j <i+1; j++) {
				System.out.print(i);
			}
			System.out.println("");
			
		}
		System.out.println("\n2)\n");
		for (i = 1; i <= 10; i++) {
			if(i%2!=0) {
				for (j = 1; j<i+1; j+=2) {
					System.out.print(j);
				}
				System.out.println("");
			}
		}
		
	}

}