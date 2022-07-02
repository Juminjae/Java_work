package ex01;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Person{
	private String name;
	private String num;
	
	public Person(String name, String num) {
		this.name=name;
		this.num=num;
	}
	
	public String toString() {
		return "[�̸� : " + name + ", ��ȭ��ȣ : " + num + "]";
	}
}

public class Answer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("ȫ�浿", new Person("ȫ�浿","010-1234-5678"));
		map.put("�̼���", new Person("�̼���","010-5678-1234"));
		map.put("������", new Person("������","010-9876-5432"));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scan.next();
				
		if(map.get(name)==null) {
			System.out.println(name+"�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(map.get(name));
		}
		System.out.println("��ü ������ ���");
		for(Map.Entry<String, Person> m: map.entrySet()) {
			System.out.println(m.getValue());
		}
		scan.close();
	}
}