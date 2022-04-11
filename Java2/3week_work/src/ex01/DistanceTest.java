package ex01;
import java.util.Scanner;

public class DistanceTest {
	
	static class DistanceComp{
		public static Distance longdistance(Distance[] dist) {
			Distance distance = dist[0];
			for(int i = 1; i < dist.length; i++) {
				if(distance.getDist() < dist[i].getDist()) {
					distance = dist[i];
				}
			}
			return distance;
		}
		
		public static Distance shortdistance(Distance[] dist) {
			Distance distance = dist[0];
			for(int i = 1; i < dist.length; i++) {
				if(distance.getDist() > dist[i].getDist()) {
					distance = dist[i];
				}
			}
			return distance;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Distance [] dist;
		Distance longdist = null, shortdist = null;
		System.out.printf(">> �����ϰ��� �ϴ� ��ü�� ���� �Է��ϼ���: ");
		int num = scan.nextInt();
		dist = new Distance[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print(">> �̸��� ���аŸ��� �Է��ϼ���: ");
			dist[i] = new Distance(scan.next(), scan.nextInt());
		}
		
		longdist = DistanceComp.longdistance(dist);
		System.out.println("���аŸ��� ���� �� �л� : "+longdist);
		shortdist = DistanceComp.shortdistance(dist);
		System.out.println("���аŸ��� ���� ª�� �л� : "+shortdist);
		int distance = longdist.getDist()-shortdist.getDist();
		System.out.println("���аŸ��� ���� �� �л��� ª�� �л��� ���̴� "+distance+" �Դϴ�.");
	}

}