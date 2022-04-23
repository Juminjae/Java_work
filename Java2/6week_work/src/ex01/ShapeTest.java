package ex01;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGraphics[] arrayOfShapes = new IGraphics[3];

        arrayOfShapes[0] = new Rectangle(12.3, 3.4);
        arrayOfShapes[1] = new Rectangle(20.3, 5.6);
        arrayOfShapes[2] = new Circle(12.3);

        System.out.println("---------- Shape Draw ----------");
        for (IGraphics arrayOfShape : arrayOfShapes) {
            arrayOfShape.draw();
            System.out.println(arrayOfShape);
            System.out.printf("ตัทน : %.2f%n", arrayOfShape.perimeter());
            System.out.println();
        }
	}
}