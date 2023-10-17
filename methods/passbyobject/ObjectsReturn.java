package methods.passbyobject;

public class ObjectsReturn {

	public static void updateFees(Student s) {
		System.out.println("Before increement fees = " + s.getFees());
		
		// s.fees = s.fees + 10 * s.fees / 100;

		s.setFees(s.getFees() + 10 * s.getFees() / 100);

		System.out.println("After increement fees = " + s.getFees());

	}

	public static void main(String[] args) {

		Student s1 = new Student("Bhupendra", 111, 1200.0);
		Student s2 = new Student("Sumit", 101, 1500.0);
		Student s3 = new Student("Aditya", 121, 200.0);
		Student s4 = new Student("Vishwa", 210, 1800.0);

		updateFees(s1); // passing the object to method

	}

}