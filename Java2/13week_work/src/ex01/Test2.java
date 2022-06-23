package ex01;

public class Test2 {

	public static <T> void displayType(T obj) {
		System.out.println(obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		float y = 0.0F;
		Test2.<Object>displayType(x);
		Test2.<Object>displayType(y);
	}
}
