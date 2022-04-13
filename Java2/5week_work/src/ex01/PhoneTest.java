package ex01;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone [] p = {new SmartPhone(), new SmartPhone("hallym",20,5,8, true)};
		for(SmartPhone obj:p) {
			System.out.println(obj);
			System.out.println("memory : " + obj.getMemory());
			System.out.println("Bluetooth : " + obj.getHasBluetooth());
			System.out.println();
		}
	}
}
