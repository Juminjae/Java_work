package ex01;

public class Hair implements Operation {
	private String type;
		
	public Hair(String type) {
		this.type=type;
	}

	public void cut() {
		System.out.println(getType()+"�� �ڸ���");
	}
	
	public void wash() {
		System.out.println(getType()+"�� ����");
	}
	
	void tint(String color) {
		System.out.println(getType()+ color +"������ �����ϴ�");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
