package java_programs;

import java.util.Scanner;

public class WeekdaysbySwitchcase 
{
	public static void main(String args[])
	{
int x; 
Scanner sc= new Scanner(System.in);
System.out.println("Enter number in to 1 to 7 =");
x=sc.nextInt();
switch(x)

{

case 1:
	System.out.println("Monday");

	break;

case 2: 
	System.out.println("tuesday"); 
	break;

case 3:

	System.out.println("Wednesday");

	break;

case 4:
	System.out.println("Thusday"); 
	break;

case 5: 
	System.out.println("Friday");

	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;

	default:
		System.out.println("Enter valid numbar");
	
}}}
	