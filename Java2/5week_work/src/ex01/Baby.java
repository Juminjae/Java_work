package ex01;

public class Baby extends Animal {
		
	public Baby(String type) {
		super(type);
	}
	public void run() {
		System.out.println(getType()+" : " + "기어다닙니다.");
	}
	public void sound() {
		System.out.println(getType()+" : " + "옹알이를 합니다.");	
	}
}
