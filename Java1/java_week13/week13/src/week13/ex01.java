package week13;

public class ex01 {

static class ArrayTest{
	public static void print(int[] arr) {
		int sum = 0;
	System.out.println("출력 결과 >");
	for (int i=0; i<arr.length; i++) {
		System.out.println("배열[" + i + "]=" + arr[i]);
		sum += arr[i];
	}
	System.out.println("배열 합: " + sum);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = {1,2,3,4,5,6,7,8,9,10};
		print(ary);
	}

}
}