package ex02;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭 ũ�� ���� ����");
		} catch (Exception e) {
			System.out.println("����");
		}
	}
}
