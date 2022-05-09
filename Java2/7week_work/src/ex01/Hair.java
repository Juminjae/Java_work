package ex01;

public class Hair implements Operation {
	private String type;
		
	public Hair(String type) {
		this.type=type;
	}

	public void cut() {
		System.out.println(getType()+"를 자르다");
	}
	
	public void wash() {
		System.out.println(getType()+"를 감다");
	}
	
	void tint(String color) {
		System.out.println(getType()+ color +"색으로 염색하다");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
