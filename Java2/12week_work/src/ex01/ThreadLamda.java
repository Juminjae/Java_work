package ex01;

public class ThreadLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(() -> {
			for(int i=0; i<7; i++) {
				char icon = (char)((Math.random()*10)+'¡ß');
				System.out.println("lamda1: "+icon);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread th2 = new Thread(()-> {
			for(int i=0; i<7; i++) {
				char n = (char)((Math.random()*26)+'a');
				System.out.println("lamda2: "+ n);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		th1.start();
		th2.start();
	}
}
