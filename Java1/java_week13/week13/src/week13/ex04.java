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
		
		System.out.println("�迭");
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
		System.out.print("ã���� �ϴ� �� �Է�: ");
		key = scan.nextInt();
		index = sequenceSearch(arr, key);
		if(index == -1)
			System.out.println("ã�� ���� �迭�� �����ϴ�.");
		else
			System.out.println("ã�� ���� �迭�ε��� [" + index + "]�� �ֽ��ϴ�.");
	}

}
