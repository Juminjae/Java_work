package ex02;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			someMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally{
			System.out.print("C");
		}
		System.out.print("D");
	}
	public static void someMethod() {
		
	}

}
