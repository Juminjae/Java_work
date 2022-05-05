package ex01;

public class Calculator {
	
	private Control cal;
	
	void setControl(Control cal) {
		this.cal=cal;
	}
	
	void compute(int a, int b) {
		cal.run(a,b);
	}
	
	static interface Control{
		public void run(int a, int b);
	}
}