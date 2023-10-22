package OOPS.constructors;

class School {
	String name;
	int std_Id;

	School() {
//		super(); // intrnaly present
	}
}

public class Con02_NoArgsConstructore {

	public static void main(String[] args) {
		School sc = new School();

		System.out.println(sc.std_Id + " " + sc.name);
	}

}
