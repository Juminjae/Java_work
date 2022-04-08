package week13;

public class ex02 {
	public static void selectionSort (int [] arrays) {
		int temp;
		int least = 0;
		
		for (int i = 0; i<arrays.length - 1; i++) {
			least = i;
			for (int j = i + 1; j<arrays.length; j++)
				if (arrays[j] < arrays[least])
					least = j;
			temp = arrays[i];
			arrays[i] = arrays[least];
			arrays[least] = temp;
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,6,8,9,4,3,2,5,0};
		System.out.println("정렬 전");
		for (int value : arr)
			System.out.print(value + " ");
		selectionSort(arr);
		System.out.println();
		System.out.println("정렬 후");
		for (int value : arr)
			System.out.print(value + " ");
	}

}
