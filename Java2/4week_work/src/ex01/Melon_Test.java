package ex01;

public class Melon_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Melon m1 = new Melon(0, 2500, 21, "Hallym_farm");
		Melon m2 = new Melon(0, 2000, 10, "Software_farm");
		
		System.out.printf("m1 객체 정보 [cal=%d\t cost=%d\t kg=%d\t 경작 농원=%s]\n", m1.getCal(), m1.getCost(), m1.getKg(), m1.getInfo());
		System.out.printf("m2 객체 정보 [cal=%d\t cost=%d\t kg=%d\t 경작 농원=%s]\n", m2.getCal(), m2.getCost(), m2.getKg(), m2.getInfo());
		System.out.println();
		
		m2.setCost(3000);
		m2.setInfo("Java_farm");
		
		System.out.println(">> m2 객체의 cost와 경작농원 정보 변경 후");
		System.out.printf("m2 객체 정보 [cal=%d\t cost=%d\t kg=%d\t 경작 농원=%s]\n", m2.getCal(), m2.getCost(), m2.getKg(), m2.getInfo());
		System.out.println();
		System.out.println("m1: 중량 >>" + m1.getKg());
		System.out.print("프로그램 종료");
	}

}
