package inheritance;
/**
 * A ==> B
 * 
 * Inheritance is a machaniusum in which one class of property aqure in another class using extends keyword
 * 
 * types of inheritance
 * 
 *1. single inhertiance
 *2. multilaevel inheritane
 *3. hierarchical inheritance
 *
 * 
 */
class Company{
	public void computerName() {
		System.out.println("Samsung");
	}
}
class Employee extends Company{
	public void newComputer() {
		System.out.println("MAC");
	}
}


public class _01_IntroOfInheritance {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.newComputer();
		e.computerName();
	}

}
