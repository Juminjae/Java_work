package ex01;

public class MyExceptionTest {
	public static void checkNegative(int number)throws MyException{
		if(number<0) {
			throw new MyException(number+" : ������ �ȵ˴ϴ�.");
		}
		System.out.println("������ ������ �ƴϱ���.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkNegative(1);
			checkNegative(-1);
		} catch (MyException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}