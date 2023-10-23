package Constructor;

/**
 * Types Of Constructore
 * 
 * 1.Default Constroctore  // NO-Argument Const
 * 2.Paramiterized Constroctore
 * 
 * Sysntax
 * 
 * ClassName(){
 *		Body
 * }
 * 
 * ClassName(){
 * 
 * }
 *
 */

class A{
 	
}

class DemoConst{
	public String aVar; //instance lavel
	public int bVar; //instance lavel
	
	public DemoConst() {
		System.out.println("No-Argument cont");
	}
	
	public DemoConst(String A, int y) {
		aVar= A;
		bVar=y;
		
	}
}

public class TypesOFConsto {

	public static void main(String[] args) {
		
		DemoConst dcNoArgs = new DemoConst();
		
		dcNoArgs.aVar= "Payas";
		dcNoArgs.bVar= 500;
		
		System.out.println(dcNoArgs.aVar+ " "+ dcNoArgs.bVar);
		
		//Paramiterized Constroctore
		DemoConst dc = new DemoConst("10", 20);
		DemoConst dc3 =new DemoConst("Riyaz", 110);
		
		System.out.println(dc.aVar+ " "+dc.bVar);
		System.out.println(dc3.aVar+ " "+dc3.bVar);
		
	}

}
