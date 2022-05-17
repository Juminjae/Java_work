package ex01;

public abstract class Food {
	private String type;
	abstract void cooking();
	
	public Food(String type) {
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "구입 순서: ) type>>" + type;
	}
}
