package ex01;

public class CellPhone {
	String telNum;
	boolean power;
	
	public CellPhone(String telNum) {
		this.telNum=telNum;
		this.power=true;
	}
	public String toString() {
		String result="�ڵ��� ����: ";
		if(power) {
			result+="on";
		}else {
			result+="off";
		}
		result += "\n�ڵ��� ��ȣ: " + telNum;
		
		return  result;
	}
	
	public void powerToggle() {
		this.power = !this.power;
	}
	
}

