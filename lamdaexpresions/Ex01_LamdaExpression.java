package Java8.lamdaexpresions;

public class Ex01_LamdaExpression {
	/*
	 * class Lam01 implements LamdaInterf01 {
	 * 
	 * public void m1() { System.out.println(); }
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		
		LamdaInterf01 l = (a, b) ->	{
			System.out.println(" Finctional Interface Using Lamda");
		};
		
		l.m1(10, 20);
		
	}

}
