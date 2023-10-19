package OOPS.methods;

import OOPS.methods.Ex01_Methods.InnerClass;

public class TestMethods {

	public static void main(String[] args) {
			
		Ex01_Methods exm= new Ex01_Methods();
		
		exm.a=100;
		System.out.println(exm.a);
		
		exm.b=200;
		System.out.println(exm.b);
		
		exm.m1();
		
		exm.m2();
		

		
	}

}

/*
 * 10
 * I am in m1 30
 * Static anonumus block 
 * Anonums block 
 * I am in constructor
 * 
 * 
 * 
 * 
 * 
 * 
 */