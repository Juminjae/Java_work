package ex01;

public class Shoes {
	private int size, cnt;
	private String type;
	Shoes(int size, int cnt, String type){
		this.size = size;
		this.cnt = cnt;
		this.type = type;
	}
	//��ü ������ ���ڿ��� ��ȯ
	public String toString() {
		return "Shoes [size="+size+", cnt=" +cnt+", type="+type+"]";
	}
	void sell(int num) {
		cnt -= num;
	}
	
	void add(int num) {
		cnt += num;
	}
	int getCnt() {
		return cnt;
	}
}
