package java_programs;

/*...The current year and the year in which the employee joined the organization are entered through the keyboard. 
If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of service are not greater than 3, then the program should do nothing.


current year
joining year
noOfYear > 3
...*/

import java.util.*;
 public class DivaliBonus
{
	public static void main(String args[])
	{
		int cy,jy;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Current Year");
		cy=sc.nextInt();
		System.out.println("Enter Joyning Year");
		jy=sc.nextInt();
		
		int ty=cy-jy;
		if(ty>3)
		{
			System.out.println("You Got Bonus OF Rs. 2500/-");
	
		}
	}
}