package ex01;
import java.util.*;

class Student{
	private String name, num;
	
	public Student(String name, String num) {
		this.name=name;
		this.num=num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [name= " + name + ", num= " + num + "]";
	}

}

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.print("이름입력: ");
		String name = scan.next();
	
		for(int i=0; i<10; i++) {
			list.add(new Student("name"+i, "phone"+i));
		}
		
		for(Student std : list) {
			if(std.getName().equals(name))
				System.out.print("phone: "+std.getNum()+"\n");
		}
		
		System.out.print("삭제할 이름 입력: ");
		String fname = scan.next();
		for (Student st: list) {
			if(st.getName().equals(fname)) {
				list.remove(st);
				break;
			}
		}
		for(Student s:list) {
			System.out.println(s);
		}
	}
}
