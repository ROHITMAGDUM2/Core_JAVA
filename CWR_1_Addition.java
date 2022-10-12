/*...WAP of Addition of two numbers
add=a+b;
...*/

import java.util.*;
class CWR_1_Addition{
	public static void main(String args[])
	{
		int a,b,add;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		add=a+b;
		System.out.println("Addition= "+add);
	}
}