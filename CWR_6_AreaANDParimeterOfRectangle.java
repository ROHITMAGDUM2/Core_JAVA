package java_programs;

/*... WAP to find Area and Parimeter to rectangle..

area of a rectangle = length × breadth;
perimeter of a rectangle = 2 × (length + breadth).
...*/

import java.util.*;
public class CWR_6_AreaANDParimeterOfRectangle
{
	public static void main(String args[])
	{
		int l,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length And Breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		
		int area=l*b;
		int p=(2*l*b);
		System.out.println("AREA OF A RECTANGLE="+area);
		System.out.println("perimeter of a rectangle ="+p);
		
	}
}
