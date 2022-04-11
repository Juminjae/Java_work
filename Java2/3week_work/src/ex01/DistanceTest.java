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
		System.out.printf(">> 생성하고자 하는 객체의 수를 입력하세요: ");
		int num = scan.nextInt();
		dist = new Distance[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print(">> 이름과 통학거리를 입력하세요: ");
			dist[i] = new Distance(scan.next(), scan.nextInt());
		}
		
		longdist = DistanceComp.longdistance(dist);
		System.out.println("통학거리가 가장 긴 학생 : "+longdist);
		shortdist = DistanceComp.shortdistance(dist);
		System.out.println("통학거리가 가장 짧은 학생 : "+shortdist);
		int distance = longdist.getDist()-shortdist.getDist();
		System.out.println("통학거리가 가장 긴 학생과 짧은 학생의 차이는 "+distance+" 입니다.");
	}

}