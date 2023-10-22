package OOPS.constructors;

class Company {
	int regId;
	String companyName;

	public Company(int regId, String companyName) {
		this.regId = regId;
		this.companyName = companyName;

	}

}

public class Con03_ParameterizedConstructor {

	public static void main(String[] args) {

		Company cmp1 = new Company(1, "Payas");
		Company cmp2 = new Company(2, "Rohit");

		System.out.println(cmp1.regId + " " + cmp1.companyName);
		System.out.println(cmp2.regId + " " + cmp2.companyName);
	}
}
