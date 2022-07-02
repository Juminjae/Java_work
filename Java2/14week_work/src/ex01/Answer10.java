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
		return "[이름 : " + name + ", 전화번호 : " + num + "]";
	}
}

public class Answer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("홍길동", new Person("홍길동","010-1234-5678"));
		map.put("이순신", new Person("이순신","010-5678-1234"));
		map.put("가나다", new Person("가나다","010-9876-5432"));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
				
		if(map.get(name)==null) {
			System.out.println(name+"는 존재하지 않습니다.");
		} else {
			System.out.println(map.get(name));
		}
		System.out.println("전체 데이터 출력");
		for(Map.Entry<String, Person> m: map.entrySet()) {
			System.out.println(m.getValue());
		}
		scan.close();
	}
}