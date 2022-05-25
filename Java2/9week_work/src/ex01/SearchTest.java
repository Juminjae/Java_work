package ex01;

public class SearchTest {
	
	public static int searchArray(int [] array, int num) throws NotFoundException{
		for(int i=0; i<array.length; i++) {
			if(num == array[i])
				return i;
		}
		throw new NotFoundException("배열에서 찾을 수 없습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,9,6,7,2,1,3,4,8};
		int num=7;
		try {
			System.out.println(num+" 의 위치는 "+searchArray(array, num)+"번째입니다.");
			System.out.println(searchArray(array, 10));
		} catch (NotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
