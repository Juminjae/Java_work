package ex01;

public class PersonTest {
	
	public static Person getMaximum(Person[] arr) {
		Person p = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i].compareTo(p)==1) {
				p=arr[i];
			}
		}
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[3];
		arr[0] = new Person("Benny", 180.0);
		arr[1] = new Person("Daniel", 178.0);
		arr[2] = new Person("Joon", 188.0);
		
		System.out.println("----------Person List----------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		Person tall = getMaximum(arr);
		System.out.println("가장 키 큰: "+tall);
	}
}
