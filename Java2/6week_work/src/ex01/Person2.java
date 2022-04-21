package ex01;

public class Person2 {
	private String name;
	private int age;
	private String num;
	
	public Person2() {
		this("anonymous",0);
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}	
}

class Student extends Person2 implements IJob,IPin{
	private int enter;
	double pay;
	
	public Student() {
		this(0, 0.0);
	}
	
	public Student(int enter, double hour) {
		super();
		this.enter=enter;
		setNum(String.format("%d%02d", enter,getPin()));
		this.pay=getPay(hour);
	}
	
	public Student(String name, int age, int enter, double hour) {
		super(name, age);
		this.enter=enter;
		setNum(String.format("%d%02d", enter,getPin()));
		this.pay=getPay(hour);
	}
	
	public int getPin() {
		return (int)(Math.random()*100);
	}
	
	public double getPay(double hour) {
		return hour*7000;
	}

	@Override
	public String toString() {
		return "Student [enter=" + enter + ", pay=" + pay + ", num=" + getNum() + "]";
	}
}

class Staff extends Person2 implements IJob, IPin{
	private static int seq;
	private double pay;
	
	public Staff() {
		this(0.0);
	}
	
	public Staff(double hour) {
		super();
		seq++;
		setNum(String.format("%d%02d", seq, getPin()));
		this.pay = getPay(hour);
	}
	
	public Staff(String name, int age, double hour) {
		super(name, age);
		seq++;
		setNum(String.format("%d%02d", seq, getPin()));
		this.pay = getPay(hour);
	}
	
	public int getPin() {
		return (int)(Math.random()*100);
	}
	
	public double getPay(double hour) {
		return hour*8000;
	}

	@Override
	public String toString() {
		return "Staff [pay=" + pay + ", num=" + getNum() + "]";
	}	
}