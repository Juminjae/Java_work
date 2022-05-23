package ex01;

public class MyExceptionTest {
	public static void checkNegative(int number)throws MyException{
		if(number<0) {
			throw new MyException(number+" : 음수는 안됩니다.");
		}
		System.out.println("다행히 음수가 아니군요.");
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
