package ex02;

public class Bike {
	protected int gear;
	public int speed;
}

class MountainBike extends Bike{
	public int seatHeight;
	
	public MountainBike(int g) {
		super();
		gear = g;
	}
}
