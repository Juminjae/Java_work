package ex01;

public interface DataAccessObject {
	//상수, 추상메소드, 디폴트메소드, 정적메소드
	void select();
	void insert();
	void update();
	void delete();
}
