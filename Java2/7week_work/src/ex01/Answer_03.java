package ex01;

public class Answer_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper = null;
		oper=new Hair("�� �Ӹ�");
		run(oper);
		oper=new Fruit("���");
		run(oper);
	}

	static void run(Operation oper) {
		oper.cut();
	    oper.wash();
	    if (oper instanceof Hair) {
	    	((Hair)oper).tint("brown");
	    } else if (oper instanceof Fruit) {
	    	((Fruit)oper).pack(10);
	    }
	}
}
