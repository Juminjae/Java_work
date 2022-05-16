package ex01;

public class Fish extends Food{
	private int count;
	
	public Fish(String type, int count) {
		super(type);
		this.count=count;
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return super.toString()+ ",\t ±¸ÀÔ·® >> " + count;
	}
	
	@Override
	void cooking() {
		System.out.println("fry or bake");
	}
}
