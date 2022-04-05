package week08;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coord crd1 = new Coord();
		crd1.setPos_x(10); 
		crd1.setPos_y(20); 
		System.out.println( crd1.toString() );
		crd1.moveXY(20,30);
		System.out.println( crd1 );
		System.out.println("X:" + crd1.getPos_x() + " Y:" + crd1.getPos_y());
	}

}
