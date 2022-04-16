package ex01;

public class Answer2 {
	
	public static void dbWork(RemoteControl db) {
		db.turnOn();
		db.setVolume(10);
		db.setMute(true);
	}
	
	public static void dbWork2(RemoteControl db2) {
		db2.turnOn();
		db2.setVolume(50);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new TV());
		dbWork2(new SmartPhone());
		RemoteControl.changeBattery();
	}

}
