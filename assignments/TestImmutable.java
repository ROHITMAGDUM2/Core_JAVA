package assignments;

public class TestImmutable {
 public static void main(String[] args) {
	ImmutableClass imc =new ImmutableClass(30);
	ImmutableClass imc1 = new ImmutableClass(40);
	
	int v1=imc.getValue();
	int v2= imc1.getValue();
	
	System.out.println(v1);
	System.out.println(v2);
}
}
