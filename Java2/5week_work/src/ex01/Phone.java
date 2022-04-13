package ex01;

public class Phone {
	private String maker;
	private int price, type;
	
	public Phone(String maker,int price, int type) {
		this.maker=maker;
		this.price=price;
		this.type=type;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "maker=" + maker + "\nprice=" + price + "\ntype=" + type;
	}
}

class SmartPhone extends Phone{
	
	private int memory;
	private boolean hasBluetooth;
	
	public SmartPhone() {
		this("None",0,0,0,false);
	}
	
	public SmartPhone(String maker, int price, int type, int memory, boolean hasBluetooth) {
		super(maker, price, type);
		this.memory=memory;
		this.hasBluetooth=hasBluetooth;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean getHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
}
