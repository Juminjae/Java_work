package ex01;
import java.util.Scanner;

public class WordTest {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Word [] obj = new Word [7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<obj.length; i++) {
            System.out.printf("%d: ���ܾ�� ���� �Է��ϼ��� >>>>>>", i+1);
            String word = new String(scan.next());
            String mean = new String(scan.next());
            obj[i] = new Word(word,mean);
        }

        while(true){
            System.out.println("ã���� �ϴ� �ܾ �Է��ϼ���. ����(f) >>");
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
                System.out.println("�ش� �ܾ �����ϴ�.");
            }
        }
        System.out.println("���α׷� ����");
        scan.close();
    }
}