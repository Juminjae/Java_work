package week12;

class Box{
	private int width; 
	private int length; 
	private int height; 

public void setwidth(int a) {
	width = a;
}
public void setlength(int b) {
	length = b;
}
public void setheight(int c) {
	height = c;
}
public int getwidth() {
	return width;
}
public int getlength() {
	return length;
}
public int getheight() {
	return height;
}
public int getVolume() {
	return (width*length*height);
}
public String toString() {
	String str = "����: ";
	str += width;
	str += ", ";
	str += "����: ";
	str += length;
	str += ", ";
	str += "����: ";
	str += height;
	str += ", ";
	str += "����: ";
	str += (width*height*length);
	return str;
}
}

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(); //box1�� ���� ��ü ����
		box1.setwidth(10);
		box1.setheight(10);
		box1.setlength(10);
		
		Box box2 = new Box(); 
		box2.setwidth(5);
		box2.setheight(5);
		box2.setlength(5); 
		
		System.out.println("box1�� ����: "+ box1.getVolume());
		System.out.println("box2�� ����: "+ box2.getVolume());
		System.out.println("box1�� ����: "+ box1.toString());
		System.out.println("box2�� ����: "+ box2.toString());
	}

}