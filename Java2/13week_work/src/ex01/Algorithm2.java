package ex01;

public class Algorithm2 {
	public static <T> void swap(T[] a, int i, int j) {
		T n = a[i];
		a[i] = a[j];
		a[j] = n;
	}
}