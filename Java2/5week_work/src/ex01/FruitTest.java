package ex01;

class Fruit{
	String me() {
		return "���� ����";
	}
}

class Apple extends Fruit{
	String me() {
		return "���� ���";
	}
}

class Grape extends Fruit{
	String me() {
		return "���� ����";
	}
}

class Pear extends Fruit{
	String me() {
		return "���� ��";
	}
}

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit [] fary = new Fruit[4];
		fary[0] = new Fruit();
		fary[1] = new Apple();
		fary[2] = new Grape();
		fary[3] = new Pear();
	
		for(Fruit a:fary) {
			System.out.println(a.me());
		}
	}
}
