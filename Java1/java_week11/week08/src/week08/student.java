package week08;

public class student {
	private String studentNo;
	private String studentName;
	private int grade;
	private String dept;
	
	public String get_studentNo(){
		return studentNo;
	}
	
	public String get_studentName() {
		return studentName;
	}
	
	public int get_grade() {
		return grade;
	}
	
	public String get_dept(){
		return dept;
	}
	
	public void set_studentNo(String number) {
		studentNo = number;
	}
	
	public void set_studentName(String name) {
		studentName = name;
	}
	
	public void set_grade(int a) {
		grade = a;
	}
	
	public void set_dept(String b) {
		dept = b;
	}
	
	public String toString(){
		return "학번 : " + studentNo + "\n이름 : " + studentName + "\n학년 : " + grade + "\n학과 : " + dept;
	}
}
