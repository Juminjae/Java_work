package ex01;

public class Person {
	private String name, address, phone;
	public Person() {
		this("null","null","null");
	}

	public Person(String name, String address) {
		this(name, address, "null");
	}
	
	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
}

class Customer extends Person{
	private int cusNum, mileage;
	
	public Customer() {
		this("null", "null", 0, 0);
	}
	
	public Customer(String name, String address, int cusNum, int mileage) {
		super(name, address);
		this.cusNum=cusNum;
		this.mileage=mileage;
	}

	public int getCusNum() {
		return cusNum;
	}

	public void setCusNum(int cusNum) {
		this.cusNum = cusNum;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		String str = super.toString();
		str += "\nCustomer [고객번호=" + cusNum + ", 마일리지=" + mileage + "]";
		return str;
	}
}
