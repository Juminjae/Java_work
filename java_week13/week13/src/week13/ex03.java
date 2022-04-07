package week13;

public class ex03 {
	public static void bubbleSort(int[] arrays) {
		int temp;
		
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j<arrays.length-1; j++)
				if (arrays[j] > arrays[j+1]) {
					temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,6,8,9,4,3,2,5,0};
		
		System.out.println("정렬 전");
		for (int value : arr)
			System.out.print(value + " ");
		bubbleSort(arr);
		System.out.println();
		System.out.println("정렬 후");
		for (int value : arr)
			System.out.print(value + " ");
		
	}

}
