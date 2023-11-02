package OOPS.keywords.thiskeywod;

// 1. This keyword can be used to refer current class instance variable

class Student {
	int id;
	public Student(int id) {
		this.id=id;
	}
}
public class _01_ClassInstanceUseOfThis {

	public static void main(String[] args) {
		Student st = new Student(10);
		System.out.println(st.id);
	}
}
