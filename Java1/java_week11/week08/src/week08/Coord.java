package week08;

import java.io.*;

class Coord {
	private int pos_x;
	private int pos_y;
	public int getPos_x() {
		return pos_x; 
	}
	public int getPos_y() {
		return pos_y; 
	}
	public void setPos_x(int a) {
		pos_x = a; 
	}
	public void setPos_y(int a) {
		pos_y = a; 
	}
	public void moveXY(int x,int y) {
		pos_x += x;
		pos_y += y; 
	}
	public String toString(){
		return "coordinate X:" + pos_x + " Y:" + pos_y ; 
	}
}
