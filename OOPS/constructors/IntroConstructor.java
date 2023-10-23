package Constructor;

//method = fuction, tasks, code reusbillity

//const ==tasks ,code reusbillity
//1. Same As a class
//2. no return type
//3. we can assign modifers public, private, protected, No-modifined
//4.default

class DoSome{
	
	DoSome(){//User defin no Argument cont 
		System.out.println("I am Constructore");
	}
	
	void adddition(int a, int b) {
		 System.out.println(a+b);	
		}
}


public class IntroConstructor {

	public static void main(String[] args) {
//		new Object / const= value initialization
		DoSome d = new DoSome();//invoke
		
		
		
		
//		d.adddition(10, 20);
//		d.adddition(5, 9);
//		d.adddition(100, 200);
	}

}
