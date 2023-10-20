package interfaces.db;

public class Appache implements Database {

	@Override
	public void connection() {
		System.out.println("Database Conect with Appache");
	}
}
