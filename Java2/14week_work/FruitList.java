package ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"���","��","�ٳ���"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		list.add("����");
		list.add(2, "�ڸ�");
		System.out.println("------ ����Ʈ ��� ------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		System.out.println("�ε��� 3 : " + list.get(3));
		list.set(2, "�޷�");
		list.add("��");
		System.out.println("�谡 ����� ��ġ : " + list.indexOf("��"));
		list.remove("�ٳ���");
		System.out.println("------ ����Ʈ ��� ------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
	}

}
