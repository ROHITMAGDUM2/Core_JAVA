package java_programs;

/*... WAP to find a area and circumfurance of the circle

circumference: c = 2πr
area: A = πr²

..*/

import java.util.*;
public class CWR_5_AreaAndCircumfarance
{
	public static void main(String args[])
	{
		int r;
		double a,c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Radius");
			r=sc.nextInt();
		}
		c = 2*3.1412*r;
		System.out.println("Circumference= "+c);
		
		a=3.1412*r*r;
		System.out.println("Area= "+a);
		
		
	}
}