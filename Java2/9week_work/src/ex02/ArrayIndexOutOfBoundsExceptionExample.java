package ex02;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args){
		int[] array = new int[2];
		
		try {
			array [2] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� Ȯ���ؼ� ����ϼ���");
		}
	}
}
