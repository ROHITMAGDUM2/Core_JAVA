package interfaces.db;

public class Oracle implements Database {
	@Override
	public void connection() {
		System.out.println("Database Conect with Oracle");
	}
}
