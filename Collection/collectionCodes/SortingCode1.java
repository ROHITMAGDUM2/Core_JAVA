package collectionCodes;

public class SortingCode1 implements compaeable<SortingCode1>{

	String name;
	int rn;
	double fees;
	
	public SortingCode1(String name,int rn,	double fees) {
		super();
		this.name= name;
		this.rn=rn;
		this.fees=fees;
		
	}
	@override
	public String toString() {
		return"[name=a" + name + ", rn=" + rn + ", fees=" + fees + "]";
	}
	
	@override
	public int compareTo(SortingCode1 o) {
		if (o.fees> fees)
			return 10;
		else if (o.fees> fees)
			return -10;
		else
			return 0;
	}

}
