package ex01;

public class ShoesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes sh = new Shoes(255, 3, "샌들");
		System.out.println(sh.toString());
		System.out.println("샌들 한 개를 팔았습니다.");
		sh.sell(1);
		System.out.println("현재 샌들의 개수는 " + sh.getCnt()+ " 입니다");
		System.out.println("샌들 2개를 추가합니다");
		sh.add(2);
		System.out.println("현재 샌들의 개수는 " + sh.getCnt()+ " 입니다");
	}

}
