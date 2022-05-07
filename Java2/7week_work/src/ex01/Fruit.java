package ex01;

public class Fruit implements Operation {
	private String type;	
	
	public Fruit(String type) {
		this.type=type;
	}

	public void cut() {
		System.out.println(getType()+"를 자르다");
	}
	
	public void wash() {
		System.out.println(getType()+"를 씻다");
	}
	
	void pack(int cnt) {
		System.out.println(getType()+"를 "+ cnt +"개 포장하다");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
