package ex01;
import java.util.Scanner;

public class Answer_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("기기를 선택하세요");
		System.out.printf("1:MP3 2:CDPlay 3:WindowMediaPlay >>");
		int num = scan.nextInt();
		
		Media MP3 = new Media() {
			@Override
			void play(String instru) {
				System.out.println("MP3를 재생합니다.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("MP3를 중지합니다.");
			}
		};
		
		Media CDPlay = new Media() {
			@Override
			void play(String instru) {
				System.out.println("CDPlay를 재생합니다.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("CDPlay를 중지합니다.");
			}
		};
		
		Media WindowMediaPlay = new Media() {
			@Override
			void play(String instru) {
				System.out.println("WindowMediaPlay를 재생합니다.");
			}
			@Override
			void stop(String instru) {
				System.out.printf("WindowMediaPlay를 중지합니다.");
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
