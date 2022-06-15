package ex01;

class Job1 extends Thread{
	
	public Job1(String s) {
		setName(s);
	}
	
	public void run() {
		for(int i=0; i<4; i++) {
			System.out.println(getName()+i);
		}
	}
}

//class Job2 extends Thread{
//	
//	public Job2() {
//		setName("Thread2: ");
//	}
//	public void run() {
//		for(int i=0; i<4; i++) {
//			System.out.println(getName()+i);
//		}
//	}
//}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Job1("Thread1: ");
		Thread t2 = new Job1("Thread2: ");
		t.start();
		t2.start();
	}
}