package ex01;

public class Dog {
	private static int total;
	int age, food;
	String color;
	
	public static int getTotal() {
		return total;
	}
	
	public Dog() {
		this(0,"����",0);
	}
	
	public Dog(int age, String color, int food) {
		total++;
		this.age=age;
		this.color=color;
		this.food=food;
	}
	
	String barking() {
		if(food == 0)
			return ("�ù���");
		food--;
			return ("�۸�");
	}

	boolean hungry() {
		if (food <= 1) {
			return true;
		}
		return false;
	}	
	
	boolean sleeping(int food) {
		if (food > 0) {
			this.food+=food;
		return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		return "Dog {"+"����: "+age+" ����: "+color+" ����: "+food+" ��ü ��: "+total+"}";
	}
}
