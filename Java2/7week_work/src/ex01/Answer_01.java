package ex01;

public class Answer_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action ac = new Action() {
			public void move() {
				System.out.println("Move, Move");
			}
		};
		Action act = () -> {
			System.out.println("Lamda, Move");
		};
		ac.move();
		act.move();
	}

}
