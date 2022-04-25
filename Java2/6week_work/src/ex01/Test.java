package ex01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();
		Person2 p2 = new Person2("benny", 20);
		Student stu1 = new Student();
		Student stu2 = new Student(2015,3.0);
		Staff st1 = new Staff();
		Staff st2 = new Staff(8.0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(st1);
		System.out.println(st2);
	}
}
