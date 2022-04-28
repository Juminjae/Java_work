package ex02;

public class IControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IControll IC = new IControll() {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("Play");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Stop");
			}
		};
		IC.play();
		IC.stop();
	}
}
