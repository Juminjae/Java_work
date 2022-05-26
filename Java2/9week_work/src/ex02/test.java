package ex02;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java python script";
		System.out.println(str.indexOf("thon"));
		System.out.println(str.substring(12));
		
		StringBuilder sb = new StringBuilder("hallym");
		System.out.println(sb.delete(1, 3));
	}

}
