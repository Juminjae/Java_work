package ex01;

public class ShoesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes sh = new Shoes(255, 3, "����");
		System.out.println(sh.toString());
		System.out.println("���� �� ���� �Ⱦҽ��ϴ�.");
		sh.sell(1);
		System.out.println("���� ������ ������ " + sh.getCnt()+ " �Դϴ�");
		System.out.println("���� 2���� �߰��մϴ�");
		sh.add(2);
		System.out.println("���� ������ ������ " + sh.getCnt()+ " �Դϴ�");
	}

}
