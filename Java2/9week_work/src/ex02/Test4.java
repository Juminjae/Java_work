package ex02;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과 불가");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}
