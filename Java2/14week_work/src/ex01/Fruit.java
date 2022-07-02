package ex01;

import java.util.ArrayList;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("candy");
				
		for(String s: list) {
			System.out.println(s);
		}
	}
}