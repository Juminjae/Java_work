package ex02;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try");
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} finally {
			System.out.println("finally");
		}
	}
}
