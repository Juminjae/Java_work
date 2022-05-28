package ex02;

public class Test1 {

	public static void throwit() throws RuntimeException{
		System.out.print("A ");
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try  {
            System.out.print("B ");
            throwit();
        }
        catch (Exception re ) {
            System.out.print("C ");
        }
        finally  {
            System.out.print("D ");
        }
        System.out.println("E ");
	}
}
