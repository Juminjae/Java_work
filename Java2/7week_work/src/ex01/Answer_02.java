package ex01;
import java.util.Scanner;

public class Answer_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("��⸦ �����ϼ���");
		System.out.printf("1:MP3 2:CDPlay 3:WindowMediaPlay >>");
		int num = scan.nextInt();
		
		Media MP3 = new Media() {
			@Override
			void play(String instru) {
				System.out.println("MP3�� ����մϴ�.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("MP3�� �����մϴ�.");
			}
		};
		
		Media CDPlay = new Media() {
			@Override
			void play(String instru) {
				System.out.println("CDPlay�� ����մϴ�.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("CDPlay�� �����մϴ�.");
			}
		};
		
		Media WindowMediaPlay = new Media() {
			@Override
			void play(String instru) {
				System.out.println("WindowMediaPlay�� ����մϴ�.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("WindowMediaPlay�� �����մϴ�.");
			}
		};
		
		if (num == 1) {
			MP3.play(null);
			MP3.stop(null);
		} else if (num == 2) {
			CDPlay.play(null);
			CDPlay.stop(null);
		} else if (num == 3) {
			WindowMediaPlay.play(null);
			WindowMediaPlay.stop(null);
		}
	}
}
