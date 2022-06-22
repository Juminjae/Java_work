package ex01;

final class MyAlgorithm{
	public static <T extends Integer> T max(T x, T y) {
		return x > y ? x : y;
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyAlgorithm.max(34, 20));
	}

}
