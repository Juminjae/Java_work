package ex01;

import ex01.Calculator.Control;

public class Answer_05 {

	static class Add implements Control {
		public void run(int a, int b) {
			System.out.println(a+"+"+b+"="+(a+b));
		}
	}
	
	static class Exp implements Control {
		public void run(int a, int b) {
			System.out.println(a+"**"+b+"="+(int)(Math.pow(a, b)));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
		cal.setControl(new Exp());
		cal.compute(5,3);
	}
} 