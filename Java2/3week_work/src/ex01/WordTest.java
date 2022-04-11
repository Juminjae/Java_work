package ex01;
import java.util.Scanner;

public class WordTest {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Word [] obj = new Word [7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<obj.length; i++) {
            System.out.printf("%d: 영단어와 뜻을 입력하세요 >>>>>>", i+1);
            String word = new String(scan.next());
            String mean = new String(scan.next());
            obj[i] = new Word(word,mean);
        }

        while(true){
            System.out.println("찾고자 하는 단어를 입력하세요. 종료(f) >>");
            String input = new String(scan.next());
            if(input.equals("f")){
                break;
            }
            boolean flag = true;
            for(Word word : obj){
                if(word.getword().equals(input)){
                    System.out.println(word.toString());
                    flag = false;
                }
            }
            if(flag){
                System.out.println("해당 단어가 없습니다.");
            }
        }
        System.out.println("프로그램 종료");
        scan.close();
    }
}