package ex01;

public class Answer_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestStudent obj[] = {new NestStudent("ȫ�浿",2), new NestStudent("�Ӳ���",3), 
							 new NestStudent("��û��",1)};
		
		for (NestStudent ns:obj){
			ns.stdPrint();
		}
	}
}
