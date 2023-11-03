package OOPS.keywords.thiskeywod;

// 6. this can be used to return the current class instance from the method

class Collage{
	Collage student() {
		return this;
	}
}

public class _06_ClassInstaceFromMethod {
	public static void main(String[] args) {
		Collage clg = new Collage();
		clg.student();
	}
	
}
