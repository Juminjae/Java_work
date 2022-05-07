package ex01;

public class Fruit implements Operation {
	private String type;	
	
	public Fruit(String type) {
		this.type=type;
	}

	public void cut() {
		System.out.println(getType()+"�� �ڸ���");
	}
	
	public void wash() {
		System.out.println(getType()+"�� �Ĵ�");
	}
	
	void pack(int cnt) {
		System.out.println(getType()+"�� "+ cnt +"�� �����ϴ�");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
