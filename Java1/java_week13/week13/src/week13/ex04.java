package week13;

import java.util.Scanner;

public class ex04 {
	public static int sequenceSearch(int[] arrays, int key) {
		for (int i = 0; i<arrays.length; i++) {
			if (arrays[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,6,8,9,4,3,2,5,0};
		int key, index;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열");
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
		System.out.print("찾고자 하는 값 입력: ");
		key = scan.nextInt();
		index = sequenceSearch(arr, key);
		if(index == -1)
			System.out.println("찾는 값이 배열에 없습니다.");
		else
			System.out.println("찾는 값은 배열인덱스 [" + index + "]에 있습니다.");
	}

}
