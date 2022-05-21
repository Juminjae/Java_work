package ex01;

public class MidExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food[] f = {new Fish("��¡��", 5), new Fish("����", 2), new Fruit("����", "��û")
				,new Fruit("���", "����"), new Fish("����", 20)};
		
		System.out.println("---------- �迭 ���� ��� ----------");
		for (Food v : f) {
			System.out.println(v);
		}
		System.out.println("\n---------- ������ ��� ----------");
		for (Food v : f) {
			System.out.print(v.getType()+ ">>");
			v.cooking();
		}
		System.out.println("\n������ Fish�� ��� " + info(f) + "���� �Դϴ�. ");
		System.out.println("");		
	}

	private static int info(Food[] f) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Food food: f) {
			if(food instanceof Fish) {
				count += ((Fish) food).getCount();
			}
		}
		return count;
	}
}
