package ex01;

public class NotUseId extends Exception {
	public NotUseId(String message) {
		super(message+"는 사용할 수 없는 아이디");
	}
}
