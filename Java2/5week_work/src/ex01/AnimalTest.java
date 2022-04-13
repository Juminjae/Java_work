package ex01;

abstract class Animal { //�߻�Ŭ���� ��ü �����Ұ�
	private String type; // ����
	public Animal(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	abstract void run(); //�߻�޼ҵ� - ������
	abstract void sound();
}

public class AnimalTest {
	
	public static void play(Animal ani){ //�Ű����� ������
		ani.run();
		ani.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Baby("�Ż���");
		play(animal);
		animal = new Dog("������");
		play(animal);
	}
}
