package ex01;
import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog [] obj = new Dog [5];
	     int [] age_list = {1,2,3,4,5};
	     int [] food_list = {5,4,3,2,1};
	     String [] color_list = {"black","gray","brown","puple","white"};

	     for(int i=0;i<5;i++){
	    	 obj[i] = new Dog(age_list[i], color_list[i], food_list[i]);
	     }
	     Scanner scan = new Scanner(System.in);
	     System.out.println("무슨 색인가요?");
	     String color_input = scan.next();

	     for(Dog dog : obj){
	    	 if(dog.color.equals(color_input)){
	    		 System.out.println(dog.toString());
	      }
	    }
	}
}