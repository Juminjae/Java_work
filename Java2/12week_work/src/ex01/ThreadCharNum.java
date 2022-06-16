package ex01;

class CharThread extends Thread{
	
	private char[] cs;
	private int num;

	public CharThread(char[] cs, int num) {
		this.cs=cs;
		this.num=num;
	}
	
	public void run() {
		for(int i=0; i<num; i++) {
			int n = (int)(Math.random()*cs.length);
			System.out.print(cs[n]+"  ");
		}
	}
	
}

class NumThread extends Thread{

	private int num;

	public NumThread(int num) {
		this.num=num;
	}
	
	public void run() {
		for (int i=0; i<num; i++) {
			int n = (int)(Math.random()*10);
			System.out.print(n+"  ");
		}
	}	
}

public class ThreadCharNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*21+1);
		Thread cht = new CharThread(new char[] {'б▐', 'бр'},num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}
