package ex01;

public class Info {
	String id;
	int pass;
	
	public Info(String id) {
		this.id = id;
		this.pass = (int)(Math.random()*8999)+1000;
	}
	

	void display() {
		System.out.println("id : "+id+"\tpassword : " + pass);
	}
}
