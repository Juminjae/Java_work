package ex01;

public class printTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "abc";
		String y = x.replace('a', 'd');
		
		y = y + "xyz";
		System.out.println(y);
		
		x = y.toUpperCase();
		System.out.println(x);
	}

}
