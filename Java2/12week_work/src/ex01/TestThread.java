package ex01;

class Thread1 extends Thread{
	
	public Thread1() {
		setName("lamda1: ");
	}

	@Override
	public void run() {
		for(int i=0; i<7; i++) {
			char icon = (char)((Math.random()*10)+'¡ß');
			System.out.println(getName()+icon);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{

	public Thread2() {
		setName("lamda2: ");
	}
	
	@Override
	public void run()  {
		for(int i=0; i<7; i++) {
			char n = (char)((Math.random()*26)+'a');
			System.out.println(getName()+ n);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		th1.start();
		th2.start();
	}
}