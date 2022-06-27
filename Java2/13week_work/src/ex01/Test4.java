package ex01;

class MyArray <T>{

	private T[] array;
	
	public MyArray(T[] array) {
		this.array=array;
	}
	
	public void display() {
		for(T data: array)
			System.out.print(data + " ");
		System.out.println();	
	}

	public T firstE() {
		return array[0];
	}

	public T lastE() {
		return array[array.length-1];
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray<Integer> digit = new MyArray<>(new Integer[] {5, 3, 9, 5, 2, 78, 45, 91});
		MyArray<Double> real = new MyArray<>(new Double[] {2.3, 1.2, 67.3, 45.2, 4.2, 66.4});
		MyArray<Character> ch = new MyArray<>(new Character[] {'d','r','q','y','p','b','s'});
	
		System.out.println("- Integer �迭 ���� ��� -");
        digit.display();
        System.out.println();

        System.out.println("- Double �迭 ���� ��� -");
        real.display();
        System.out.println();

        System.out.println("- Character �迭 ���� ��� -");
        ch.display();
        System.out.println();

        System.out.println("------- Integer �迭�� ù������ ������ ���� : " + digit.firstE() + " / " + digit.lastE());
        System.out.println("------- Double �迭�� ù������ ������ ���� : " + real.firstE() + " / " + real.lastE());
        System.out.println("------- Character �迭�� ù������ ������ ���� : " + ch.firstE() + " / " + ch.lastE());
	}
}
