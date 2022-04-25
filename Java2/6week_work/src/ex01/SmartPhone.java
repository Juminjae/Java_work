package ex01;

public class SmartPhone implements RemoteControl {
	public void turnOn() {
		System.out.println("SmartPhone을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("SmartPhone을 끕니다.");
	}
	
	public void setVolume(int volume) {
		System.out.printf("---- SmartPhone 볼륨을 %d으로 합니다 ----\n" , volume);
		System.out.printf("현재 SmartPhone 볼륨: %d\n", volume);
	}

}
