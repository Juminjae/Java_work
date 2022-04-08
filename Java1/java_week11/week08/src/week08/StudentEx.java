package week08;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student std1 = new student();
		std1.set_studentNo("202100001");
		std1.set_studentName("주민재");
		std1.set_grade(1);
		std1.set_dept("소프트웨어융합대학");
		
		student std2 = new student();
		std2.set_studentNo("202100002");
		std2.set_studentName("홍길동");
		std2.set_grade(1);
		std2.set_dept("소프트웨어융합대학");
		
		student std3 = new student();
		std3.set_studentNo("202000001");
		std3.set_studentName("이순신");
		std3.set_grade(2);
		std3.set_dept("의과대학");
		
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());
	}

}
