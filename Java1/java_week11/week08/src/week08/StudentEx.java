package week08;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student std1 = new student();
		std1.set_studentNo("202100001");
		std1.set_studentName("�ֹ���");
		std1.set_grade(1);
		std1.set_dept("����Ʈ�������մ���");
		
		student std2 = new student();
		std2.set_studentNo("202100002");
		std2.set_studentName("ȫ�浿");
		std2.set_grade(1);
		std2.set_dept("����Ʈ�������մ���");
		
		student std3 = new student();
		std3.set_studentNo("202000001");
		std3.set_studentName("�̼���");
		std3.set_grade(2);
		std3.set_dept("�ǰ�����");
		
		System.out.println(std1.toString());
		System.out.println(std2.toString());
		System.out.println(std3.toString());
	}

}
