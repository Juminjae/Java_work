package ex01;

class Fruit{
	String me() {
		return "나는 과일";
	}
}

class Apple extends Fruit{
	String me() {
		return "나는 사과";
	}
}

class Grape extends Fruit{
	String me() {
		return "나는 포도";
	}
}

class Pear extends Fruit{
	String me() {
		return "나는 배";
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
