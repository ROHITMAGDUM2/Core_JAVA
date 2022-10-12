/*...WAP of Multiplication of two numbers.
sub=a*b;
...*/

import java.util.*;
class CWR_3_Multiplication
{
	public static void main(String args[])
	{
		int j,k,mul;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Two Numbers");
		j=sc.nextInt();
		k=sc.nextInt();
		
		mul=j*k;
		System.out.println("Multiplication= "+mul);
	}
}
