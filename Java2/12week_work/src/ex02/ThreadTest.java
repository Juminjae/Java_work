package ex02;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread movie_thread = new Thread() {
			@Override
			public void run() {
				int i=0;
				while(true) {
					System.out.println(i++ +")동영상을 재생합니다.");
					if(Thread.interrupted()) {
						break;
					}
				}
				System.out.println("자원 정리");
				System.out.println("실행 종료");
			}
		};
		movie_thread.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
		}
		movie_thread.interrupt();
		System.out.println("메인 스레드 종료");
	}
}
