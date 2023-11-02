package OOPS.keywords.thiskeywod;

// 3. this() can be used to invoke corrent class constructore 

class MSG{
	MSG(){
		System.out.println("Default Constructore");
	}
	MSG(String text){
		this();
		System.out.println("Parameterized Constructore");
	}
}

public class _03_InvokeConstructore {
	public static void main(String[] args) {
		MSG m= new MSG("Hii");
	}
}
