//�й� : 20215249 
//�̸� : �ֹ���
//���迬��� ������������ ����� ����ϴ� ���α׷�

package week05;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, computer, eng, math, absence, leap, num;
		char married, gender;
		double total, average;
		
		married = 'Y';
		gender = 'M';
		age = 26;
		computer = 80;
		eng = 90;
		math = 65;
		leap = 2020;
		absence = 3;
		num = 15;
		
		total = computer + eng + math;
		average = total / 3.0;
		
		System.out.print("1. ��ȥ�ΰ�: " + (married == 'Y'));
		System.out.print("\n2. ���̰� 19�� �̻��̰� �����ΰ�:" + (age >= 19 && gender == 'M'));
		System.out.print("\n3. ��ǻ�Ϳ� ���� �׸��� ���� ��ΰ� 90�� �̻��ΰ�: " + (computer>=90 && eng>=90 && math>=90));
		System.out.print("\n4. ������ 200�� �̻��̰ų� ����� 60�� �̽��ΰ�: " + (total >= 200  || average >= 60));
		System.out.print("\n5. ������ 60�� �̸��̰ų� �ἮȽ���� 4�� �̻��ΰ�: " + (total <= 60 || absence >= 4));
		System.out.print("\n6. ������ �⵵�� �����ΰ�: " + (leap == 2020));
		System.out.print("\n7. �Էµ� ���ڰ� ¦���ΰ�: " + (num == 15));
		System.out.print("\n8. �Էµ� ���ڰ� 3�� 5�� ������ΰ�: " + (num == 15));
	}

}