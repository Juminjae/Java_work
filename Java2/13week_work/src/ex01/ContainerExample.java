package ex01;

class Container <T> {
	private T a;

	public T get() {
		return a;
	}

	public void set(T a) {
		this.a = a;
	}	
}

public class ContainerExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> con1 = new Container<>();
		con1.set("ȫ�浿");
		String str = con1.get();
		System.out.println(str);
		
		Container<Integer> con2 = new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
}