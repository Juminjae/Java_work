package ex01;

class MyMath<T>{

	double getAverage(Integer[] list) {
		int sum = 0;
		for(int i=0; i<list.length; i++) {
			sum += list[i]; //기초 자료형변환을 해야함
		}
		return sum/list.length;
	}
	
	double getAverage(Byte[] blist) {
		double sum = 0;
		for(int i=0; i<blist.length; i++) {
			sum+=blist[i];
		}
		return sum/blist.length;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {32,5,36,8,41,74,59,9,11};
		Byte[] blist = {4,12,7,84,23,4};
		
		MyMath<Integer> m = new MyMath<Integer>();
		MyMath<Byte> bm = new MyMath<>();
		System.out.printf("$.2f\n", m.getAverage(list));
		System.out.printf("%.2f\n", bm.getAverage(blist));
 	}
}
