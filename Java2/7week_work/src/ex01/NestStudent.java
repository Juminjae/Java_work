package ex01;

import java.util.Scanner;

public class NestStudent {
	private String name;
	private Subject subject;
	
	public NestStudent(String name, int cnt) {
		this.name=name;
		subject = new Subject(cnt);
	}
	
	void stdPrint() {
		System.out.println("==================");
		System.out.println(name + "학생의 수강과목 ");
		subject.subjectprint();
	}

class Subject{
	private String[] subjects;

	public Subject(int num) {
		subjects = new String[num];
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		System.out.println(name + "==>");
		for (int i = 0; i < num; i++) {
			System.out.printf("수강 과목(%d) : ", i+1);
			subjects[i] = scan.next();
		}	
	}
	public void subjectprint() {
		for (String s : subjects) {
				System.out.println(s);
		}	
	}
}
}

