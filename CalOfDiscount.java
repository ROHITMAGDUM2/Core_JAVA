package java_programs;

/*...While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If quantity and price per item are input through the keyboard, write a program to calculate the total expenses.

int q,ta,d,
when q>1000 then got 10%
get user input "Enter quantity And Price"

q=2000;
if q>1000
	{
		q*p=total_amount;
		discount=ta*10/100;
		System.out.println("your TOtal amount= "+ta);
		System.out.println("your Discount is= "+d);
		
		
	}
...*/

import java.util.*;
public class CalOfDiscount
	{
	public static void main(String args[])
	{
		int p,q,ta,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Quantity And Price Of itam");
		q=sc.nextInt();
		p=sc.nextInt();
		
		
		ta=p*q;
		if(q>1000){
			d=(ta*10/100);
			System.out.println("Your Total Amount= "+ta);
			System.out.println("Your Discount= "+d);
		}
		else
			System.out.println("Your Total Amount is= "+ta);
	}
	}