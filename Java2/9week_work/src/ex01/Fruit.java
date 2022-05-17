package ex01;

public class Fruit extends Food {
	private String farm;
	
	public Fruit(String type, String farm) {
		super(type);
		this.farm=farm;
	}

	@Override
	public String toString() {
		return super.toString() +",\t °æÀÛ³ó¿ø >> " + farm;
	}
	
	@Override
	void cooking() {
		System.out.println("cut fruit");
	}
}
