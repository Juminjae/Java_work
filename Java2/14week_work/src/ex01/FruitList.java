package ex01;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"사과","배","바나나"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		list.add("포도");
		list.add(2, "자몽");
		System.out.println("------ 리스트 출력 ------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		System.out.println("인덱스 3 : " + list.get(3));
		list.set(2, "메론");
		list.add("배");
		System.out.println("배가 저장된 위치 : " + list.indexOf("배"));
		list.remove("바나나");
		System.out.println("------ 리스트 출력 ------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
	}

}
