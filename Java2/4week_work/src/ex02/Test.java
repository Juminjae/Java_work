package ex02;

class C{
	public C() { System.out.println("1"); }
	public C(int x) { System.out.println("2"); } 
}

class D extends C{
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		System.out.println("실행 완료");
	}

}
