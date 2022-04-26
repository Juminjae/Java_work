package ex01;

public class TV implements RemoteControl{
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		System.out.printf("---- TV 볼륨을 %d으로 합니다 ----\n", volume);
		System.out.printf("현재 TV 볼륨: %d\n" , volume);
		System.out.println("---- TV 볼륨을 무음으로 합니다----");
	}
}
