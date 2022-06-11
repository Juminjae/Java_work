package ex01;
import java.util.*;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		for(int i=0; i<5; i++) {
			int dice = random.nextInt(6)+1;
			System.out.println(dice);
		}		
	}
}