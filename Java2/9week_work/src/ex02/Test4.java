package ex02;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ� �Ұ�");
		}
	}
	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}
