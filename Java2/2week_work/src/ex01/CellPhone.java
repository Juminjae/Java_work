package ex01;

public class CellPhone {
	String telNum;
	boolean power;
	
	public CellPhone(String telNum) {
		this.telNum=telNum;
		this.power=true;
	}
	public String toString() {
		String result="핸드폰 상태: ";
		if(power) {
			result+="on";
		}else {
			result+="off";
		}
		result += "\n핸드폰 번호: " + telNum;
		
		return  result;
	}
	
	public void powerToggle() {
		this.power = !this.power;
	}
	
}

