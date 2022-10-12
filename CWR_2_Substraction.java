/*...WAP of Substraction of two numbers.
sub=a-b;
...*/

import java.util.*;
class CWR_2_Substraction
{
	public static void main(String args[])
	{
		int p,q,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Two Numbers");
		p=sc.nextInt();
		q=sc.nextInt();
		
		sub=p-q;
		System.out.println("Substraction= "+sub);
	}
}
