package OOPS.constructors;

/**
 * @author RM
 *
 *         Constructor in java
 * 
 *         It is block (similar to method) having same name as that of class
 *         name It dose not have any return type, not even 'void' only 4
 *         modifiers applicable for constructor , they are public, protected, no
 *         modifier and private.(ststic, final, synchronized etc can not be used
 *         with constructors). it exiecute automaticaly when we create an object
 * 
 *         Use: It is use to intialize to boject(not to create object)
 * 
 *         types of constructor :
 * 
 *         1. Deafault constructor( create by compiler) No-orgumments
 *         constructor(create by Programmer) 3. Parameterrzed consructor
 * 
 */

class Employee {
	String name;
	int emp_id;

}

public class Con01_IntroConstructor {

	public static void main(String[] args) {
		System.out.println("Introduction of Constroctors");

		Employee emp = new Employee();
// 		here is a default constuctore(defined by compilere) which initialize value to object		
		System.out.println(emp.emp_id + " " + emp.name);

	}

}
