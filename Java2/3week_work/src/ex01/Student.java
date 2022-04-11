package ex01;

public class Student {
	private String name;
	private double score;
	private String grade;
	
	public Student() {
		this("anonymous", 0.0);
	}
	
	public Student(String name) {
		this(name, 0.0);
	}
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
		Cal();
	}
	
	public Student(String name, double score, String grade) {
		this.grade=grade;
		Cal();
	}
			
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(double score) {
		this.score=score;
		Cal();
	}
	
	public void Cal() {
		if(score >= 95) {
			this.grade = "A+";
		}else if(score >= 90) {
			this.grade = ("A");
		}else if(score >= 80) {
			this.grade = ("B+");
		} else if (score >= 70){
			this.grade = ("C");
		} else {
			this.grade = ("F");
		}
	}
	
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 성적=" + score + ", 등급=" + grade + "]";
	}
}


