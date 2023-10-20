package interfaces.db;

public class mySql implements Database{

		@Override
		public void connection() {
			System.out.println("Database Conect with MySQL");
		}
	
}
