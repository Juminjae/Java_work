package ex01;

public class SmartPhone implements RemoteControl {
	public void turnOn() {
		System.out.println("SmartPhone�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("SmartPhone�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		System.out.printf("---- SmartPhone ������ %d���� �մϴ� ----\n" , volume);
		System.out.printf("���� SmartPhone ����: %d\n", volume);
	}

}
