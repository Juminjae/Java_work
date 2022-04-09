package ex01;

public class Shoes {
	private int size, cnt;
	private String type;
	Shoes(int size, int cnt, String type){
		this.size = size;
		this.cnt = cnt;
		this.type = type;
	}
	//객체 내용을 문자열로 반환
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
