package ex01;

class MyPair<T>{
	private T fruit;
	private T fruit2;
	
	public MyPair(T fruit, T fruit2) {
		this.fruit=fruit;
		this.fruit2=fruit2;
	}

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

	public T getfruit2() {
		return fruit2;
	}

	public void setfruit2(T fruit2) {
		this.fruit2 = fruit2;
	}

	@Override
	public String toString() {
		return "value1 : " + fruit.toString() + "\tvalue2 : " + fruit2.toString();
	}
}

class Student{
	private String number;
	
	public Student(String number) {
		// TODO Auto-generated constructor stub
		this.number=number;
	}	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + number + "]";
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPair<String> fruit = new MyPair<>("사과","포도");
		MyPair<Student> number = new MyPair<>(new Student("hallym"), new Student("software"));
		System.out.println(fruit);
		System.out.println(number);
	}
}
