package ex01;

public class TV implements RemoteControl{
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		System.out.printf("---- TV ������ %d���� �մϴ� ----\n", volume);
		System.out.printf("���� TV ����: %d\n" , volume);
		System.out.println("---- TV ������ �������� �մϴ�----");
	}
}
