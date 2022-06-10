package ex01;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year+"³â "+month+"¿ù "+day+"ÀÏ");
	}
}
