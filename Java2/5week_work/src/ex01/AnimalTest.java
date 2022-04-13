package ex01;

abstract class Animal { //추상클래스 객체 생성불가
	private String type; // 유형
	public Animal(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	abstract void run(); //추상메소드 - 재정의
	abstract void sound();
}

public class AnimalTest {
	
	public static void play(Animal ani){ //매개변수 다형성
		ani.run();
		ani.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Baby("신생아");
		play(animal);
		animal = new Dog("강아지");
		play(animal);
	}
}
