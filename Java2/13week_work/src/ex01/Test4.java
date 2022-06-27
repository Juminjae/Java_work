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
	
		System.out.println("- Integer 배열 원소 출력 -");
        digit.display();
        System.out.println();

        System.out.println("- Double 배열 원소 출력 -");
        real.display();
        System.out.println();

        System.out.println("- Character 배열 원소 출력 -");
        ch.display();
        System.out.println();

        System.out.println("------- Integer 배열의 첫번쨰와 마지막 원소 : " + digit.firstE() + " / " + digit.lastE());
        System.out.println("------- Double 배열의 첫번쨰와 마지막 원소 : " + real.firstE() + " / " + real.lastE());
        System.out.println("------- Character 배열의 첫번쨰와 마지막 원소 : " + ch.firstE() + " / " + ch.lastE());
	}
}
