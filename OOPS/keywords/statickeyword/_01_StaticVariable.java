package OOPS.keywords.statickeyword;
/**
 * 
 * @author RM
 * 
 * Access Modifiers
 *  public, private, protected, default(no-modifier)
 *  
 * Non-Access Modifiers
 *  static, final, abstract, synchronized, transient, volotile, strictfp
 * 
 * Static Keyword:
 *  Static keyword is a Non-access Mofiers
 *  use with- variable(class lavel), methods, blocks, Inner Class(Nested class)
 *
 * 1. Static Variable
 *    static variables gets memory only once in the class area at the time of class loading.
 *    
 */

class College{
	int studentId;
	String studentName;
	static String collageName= "Shivaji Univercity";
	
	College(int studentId, String studentName){
		this.studentId= studentId;
		this.studentName= studentName;
	}
	void display(){
		System.out.println(studentId+" "+studentName+" "+collageName);
	}
}


public class _01_StaticVariable {

	public static void main(String[] args) {
		College std1 = new College(1, "Rohit");
		std1.display();
		
		College std2 = new College(2, "Mayur");
		std2.display();
	}

}
