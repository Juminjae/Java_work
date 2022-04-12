package ex01;

public class People {
	private String name;
	private String PerNum;
	
	public People(String name, String PerNum) {
		this.name=name;
		this.PerNum=PerNum;
	}
	
	public int computeSalary() {
		return 0;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 사번: " + PerNum;
	}
	
}

class SalariedEmployee extends People{
	
	private int monthlySalary;
	
	public SalariedEmployee(String name, String PerNum, int salary) {
		super(name, PerNum);
		monthlySalary = salary;
	}
	
	public int computeSalary() {
		return monthlySalary * 12;
	}
	
	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return super.toString()+", 급여: " + monthlySalary + ", 연봉: "+ computeSalary();
	}	
}

class HourEmployee extends People{
	
	private int wage;
	private int hour;
	
	public HourEmployee(String name, String PerNum, int wage, int hour) {
		super(name, PerNum);
		this.wage=wage;
		this.hour=hour;
	}
	
	public int computeSalary() {
		return wage*hour;
	}
	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage=wage;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour=hour;
	}

	@Override
	public String toString() {
		return super.toString()+", 시간당 임금: " + wage + ", 일한시간: " + hour + ", 금액: "+computeSalary();
	}
}