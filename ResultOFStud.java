package java_programs;

/*...
A university has the following rules for a student to qualify for a degree with A as the main subject and B as the subsidiary subject:
(a) He should get 55 percent or more in A and 45 percent or more in B.
(b) If he gets than 55 percent in A he should get 55 percent or more in B. However, he should get at least 45 percent in A.
(c) If he gets less than 45 percent in B and 65 percent or more in A he is allowed to reappear in an examination in B to qualify.
(d) In all other cases he is declared to have failed.
Write a program to receive marks in A and B and Output whether the student has passed, failed or is allowed to reappear in B.
---------------------------------------------------------------------
A>=55
B>=45
A=45
	55=A && 45>=B ---pass
45>=B && 65<=A ----reappear exam of B
else---fail
*/

import java.util.*;
class ResultOFStud
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Main Subject(A) Marks= ");
		a=sc.nextInt();
		System.out.println("Enter Your Subsidiary Subject(B) Marks= ");
		b=sc.nextInt();
		
		if(45<=a && 45<=b)
			System.out.println("Pass");
			
		else if (45>=b && 45<=a)
			System.out.println("reappear exam of B");
			
		else
			System.out.println("Fail");
			
	}
}
