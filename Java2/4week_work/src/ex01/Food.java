package ex01;

public class Food {
	private int cal;
	private int cost;
	private int kg;
	
	public Food() {
		this(0, 0, 0);
	}
	
	public Food(int cal, int cost, int kg) {
		this.cal=cal;
		this.cost=cost;
		this.kg=kg;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}
}

class Melon extends Food{
	private String info;
	
	public Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		this.info=info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
