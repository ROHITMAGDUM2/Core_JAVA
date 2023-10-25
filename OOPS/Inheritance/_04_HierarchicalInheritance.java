package inheritance;

class Father{
	public void fatherMoney() {
		System.out.println("Fathers Properity");
	}
}

class Daughter extends Father{
	public void displayDaughter() {
		System.out.println("Daughters Property");
	}
}

class Son extends Father{
	public void displaySon(){
		System.out.println("Sons Property");
	}
}



class VG extends Daughter//
{
	
}



public class _04_HierarchicalInheritance {

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.displayDaughter();
		d.fatherMoney();
		
		Son s = new Son();
		s.displaySon();
		s.fatherMoney();
	}

}

