package ex01;

public class Answer1 {

	public static void dbWork(DataAccessObject db) {
		db.select();
		db.insert();
		db.update();
		db.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDB());
		dbWork(new MySqlDB());
	}
}
