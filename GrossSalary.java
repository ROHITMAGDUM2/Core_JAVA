package java_programs;

/*...In Company and employ is paid as under : if his basic salary is less than 1500 then HRA=10% of Basic salary and DA=90% of basic salary if his salary is either equal to or above rs=1500 then HRA=500 and DA=98% salary If the employ salary is input through the keybord write program to find his grose salary.

HRA= HOuse Raint Allounce
DA= Dearenss Allounce
emp, bs, HRA=0, DA=0,
if(bs<1500)
	hra=bs*0.10
	DA= bs*0.90
	
if(bs>= 1500)
	HRA=500
	DA=0.98
	
gs=bs+hra+da;
System.out.println("Gross salary of employee =" +gs)
...*/

import java.util.*;
public class GrossSalary
{
	public static void main(String args[])
	{
		int bs;
		double gs,hra = 0,da=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Basic Salary");
		bs =sc.nextInt();
		
		if(bs<1500)
		{
			hra=bs*0.10;
			 da=bs*0.90;
		}
		if(bs>=1500)
		{
			hra=500;
			 da=bs*0.98;
		}
		gs=bs+hra+da;
		System.out.println("Gross salary of employee ="+gs);

}}
		
		
		
		
		