package ex01;

abstract class Animal2 {
	String reaction(Animal2 ani) {
		if(ani instanceof Cat) {
			return "���������� ";
		}else {
			return "�����ø��� ";
		}
	}
	
	void sound() {
	
	}
}

class Cat extends Animal2 {
	private String name;
	
	public Cat() {
		this("Anonymous");
	}
	
	public Cat(String name) {
		this.name=name;
	}
	
	@Override
	public void sound() {
		System.out.print("��~��");
	}
	
	@Override
	public String toString() {
		return name + "�����";
	}
}

class Dog2 extends Animal2{
	private String name;
	private static int count = 0;
	
	public Dog2() {
		this("Anonymous");
	}
	
	public Dog2(String name) {
		this.name=name;
	}
	
	public void sound() {
		System.out.print("�۸�");
		count++;
	}

	@Override
	public String toString() {
		return name + "������";
	}	
	
	public static int getCountDog() {
		return count;
	}
}

public class AnimalTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2[] pets = {
				new Cat("Nabee"),
				new Dog2(),
				new Cat(),
				new Dog2(),
				new Dog2("Rock")
		};
		for(Animal2 ani:pets) {
			System.out.print("\n"+ani+"_"+ani.reaction(ani));
			ani.sound();
		}
		System.out.print("\n\nPet�� �� Dog�� " + Dog2.getCountDog() + "����\n");
	}

}
