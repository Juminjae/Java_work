package ex01;

import java.util.HashMap;
import java.util.Map;

class Count{

	public static void write(Map<Integer, Integer> map) {
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.out.printf("주사위 눈 = %d, 빈도수 = %d\n", m.getKey(), m.getValue());
		}
	}

	public static Map<Integer, Integer> count() {
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		int data;
		for(int i=1; i<=100; i++) {
			data = (int)(Math.random()*6)+1;
			Integer freq =map.get(data);
			map.put(data,(freq==null)?1:freq+1);
		}
		return map;
	}	
}

public class Answer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map;
		map = Count.count();
		System.out.println("Map에 저장된 빈도수를 출력합니다");
		Count.write(map);
	}

}