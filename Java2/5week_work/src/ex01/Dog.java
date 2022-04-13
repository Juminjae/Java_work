package ex01;

public class Dog extends Animal{
	
	public Dog(String type) {
		super(type);
	}
	public void run() {
		System.out.println(getType()+" : " + "³× ¹ß·Î ´Ù´Õ´Ï´Ù.");
	}
	public void sound() {
		System.out.println(getType()+" : " + "¸Û¸Û ¼Ò¸®¸¦ ³À´Ï´Ù.");
	}
}
