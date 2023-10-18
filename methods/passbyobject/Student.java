package methods.passbyobject;


public class Student {
	
	String sname;
	int roll;
	double fees;
	@Override
	public String toString() {
		return "Student " + sname + " " + roll + " " + fees + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(String sname, int roll, double fees) {
		super();
		this.sname = sname;
		this.roll = roll;
		this.fees = fees;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}

}