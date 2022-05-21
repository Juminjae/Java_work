package ex01;

public class MidExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food[] f = {new Fish("오징어", 5), new Fish("고등어", 2), new Fruit("딸기", "산청")
				,new Fruit("사과", "보람"), new Fish("새우", 20)};
		
		System.out.println("---------- 배열 원소 출력 ----------");
		for (Food v : f) {
			System.out.println(v);
		}
		System.out.println("\n---------- 조리법 출력 ----------");
		for (Food v : f) {
			System.out.print(v.getType()+ ">>");
			v.cooking();
		}
		System.out.println("\n구입한 Fish는 모두 " + info(f) + "마리 입니다. ");
		System.out.println("");		
	}

	private static int info(Food[] f) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Food food: f) {
			if(food instanceof Fish) {
				count += ((Fish) food).getCount();
			}
		}
		return count;
	}
}
