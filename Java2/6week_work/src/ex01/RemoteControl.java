package ex01;

public interface RemoteControl {
	public final static int MAX_VOLUM = 100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
