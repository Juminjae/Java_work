package ex01;

public class Answer_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestStudent obj[] = {new NestStudent("È«±æµ¿",2), new NestStudent("ÀÓ²©Á¤",3), 
							 new NestStudent("½ÉÃ»ÀÌ",1)};
		
		for (NestStudent ns:obj){
			ns.stdPrint();
		}
	}
}
