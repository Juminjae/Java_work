package ex01;

public class CellPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CellPhone p1 = new CellPhone("010-1234-5678");
        System.out.println(p1.toString());
        p1.powerToggle();
        System.out.println(p1.toString());
	}

}
