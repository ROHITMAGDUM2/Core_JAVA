package OOPS.Abstraction;

/**
 * 
 * @author RM
 * 
 *         Abstraction Class abstract keyword to class and abstract method in
 *         class;
 * 
 *         1. Abstract method sysntax: same as a method but no body with
 *         semecolen
 * 
 *
 */
abstract class University {
	protected abstract void questionPaper();
	
	public void Teacher() {
		
	}
}

class Collage extends University {
	public void questionPaper() {
		System.out.println("Student giving exam ");
	}
}

public class _01_IntroAbstraction {

	public static void main(String[] args) {
		Collage c = new Collage();
	}
}
