package ex01;

class Job extends Thread{
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(""+n++);
			if(n>50)
				break;
		}
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t = new Job();
			t.start();
	}
}