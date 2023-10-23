package assignments;
import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		
		int a=0,b=0,c=0;
		 try {
		System.out.println("Enter Three Numbers=");
		Scanner sc = new Scanner (System.in);
		System.out.println("a= ");
		a=sc.nextInt();
		System.out.println("b= ");
		b=sc.nextInt();
		System.out.println("c= ");
		c=sc.nextInt();
		 }catch(Exception e) {
			 System.out.println("Pls Enter Integer Number");
		 }
		if (a>b) {
			if (a>c)
				System.out.println("A is Greater");
		}
		if (b>a) {
			if(b>c)
				System.out.println("B is Greater");
		}
		if (c>a) {
			if(c>b)
				System.out.println("C is Greater");
		}
		else
			System.out.println("All are Equal");
	}

}
