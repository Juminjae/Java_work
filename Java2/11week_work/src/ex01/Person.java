package ex01;
import java.util.Arrays;

public class Person implements Comparable{
	
	private String name;
	private double height;
	
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	public Person(String name, double height) {
		this.name=name;
		this.height=height;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Person)
			return (int)(this.height - ((Person)o).height);
		else 
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person[] list = new Person[4];
	        list[0] = new Person("홍릉", 180.0d);
	        list[1] = new Person("용원", 168.0d);
	        list[2] = new Person("인성", 175.0d);
	        list[3] = new Person("성우", 170.0d);

	        System.out.println("==== 정렬 전 데이터 ====");
	        for (Person person : list) 
	        	System.out.println(person);

	        Arrays.sort(list);
	        System.out.println("==== 정렬 후 데이터 ====");
	        for (Person person : list) 
	        	System.out.println(person);
	}
}