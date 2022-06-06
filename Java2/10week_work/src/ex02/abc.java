package ex02;

import java.util.Arrays;
import java.util.StringTokenizer;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		System.out.println(stok.countTokens());
		
		System.out.println(Math.round(7.5));
		
		int[] dim = {3,6,8,12,9};
		int[] arr = Arrays.copyOfRange(dim, 2, 4);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Math.floor(7.9));
	}

}
