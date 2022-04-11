package ex01;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>객체 생성 후 <<");
		Student[] obj = {new Student(), new Student("hallym", 80.3)};
		for(Student st:obj)
			System.out.println(st);
			System.out.println();
		
		System.out.println(">> anonymous이름과 성적 설정 후 <<");	
		Student[] obj2 = {new Student("benny", 100.0)};
		for(Student st:obj2)
			System.out.println(st);
			System.out.println();
			
		System.out.println(">> hallym 성적 변경 후 <<");
		Student[] obj3 = {new Student("hallym", 60.7)};
		for(Student st:obj3)
			System.out.println(st);
	}

}
