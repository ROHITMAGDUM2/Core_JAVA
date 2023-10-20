package interfaces.db;

public class Test {

	public static void main(String[] args) {
			Database db;
			
			db= new mySql();
			db.connection();
			
			db=new Oracle();
			db.connection();
			
			db= new Appache();
			db.connection();
	}

}
