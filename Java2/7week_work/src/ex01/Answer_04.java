package ex01;

public class Answer_04 {

	public static int random() {
		return (int) (Math.random()*10)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func1 sub = (a,b) -> {
			return a+b;
		};
		Func1 add = (a,b) ->{
			return a-b;
		};
		Func1 mul = (a,b) -> {
			return a*b;
		};
		Func1 pow = (a,b) -> {
			return  (int)Math.pow(a, b);
		};
		int a = random();
		int b = random();
		System.out.println("result>> "+a+"-"+b+"="+sub.calc(a, b));
		a = random();
		b = random();
		System.out.println("result>> "+a+"+"+b+"="+add.calc(a, b));
		a = random();
		b = random();
		System.out.println("result>> "+a+"x"+b+"="+mul.calc(a, b));
		a = random();
		b = random();
		System.out.println("result>> "+a+"^"+b+"="+pow.calc(a, b));
	}
}
