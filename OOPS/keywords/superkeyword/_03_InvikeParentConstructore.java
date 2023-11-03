package OOPS.keywords.superkeyword;

// 3. supre() can be used to invoke immediate Parent class Constructore 

class ParentConst{
	ParentConst(){
		System.out.println("I am in Parent class Constructore");
	}
}

class ChildConst extends ParentConst {
	public ChildConst() {
//		super();    // Here super() working implicitaly
		System.out.println("I am in Child class Constructore");
	}
}

public class _03_InvikeParentConstructore {

	public static void main(String[] args) {
		ChildConst cc = new ChildConst();
	}

}
