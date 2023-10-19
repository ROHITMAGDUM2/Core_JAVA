package practicetest;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super{
	public abstract void m1() throws IOException; 
}

class Sub extends Super {
	@Override
	public void m1()throws IOException{
		throw new FileNotFoundException();
	}
}
public class Test3 {
	public static void main(String[] args) {
		Super s= new Sub();
		try {
			s.m1();
		} catch (Exception e) {
			System.out.println("M");
		}
		finally {
			System.out.println("N");
		}
	}

}
