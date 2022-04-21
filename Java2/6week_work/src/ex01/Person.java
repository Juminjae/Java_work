package ex01;

public class Person implements IComparable{
	private String name;
	private double height;
	
	public Person(String name, double height) {
		this.name=name;
		this.height=height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	
	public int compareTo(Object other) {
		if(this.height>((Person)other).height){
			return 1;
		} else if(this.height==((Person)other).height){
			return 0;
		} else {
			return -1;
		}
	}
}