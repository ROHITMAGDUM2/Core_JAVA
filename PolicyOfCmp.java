package java_programs;

/*
The policy followed by a company to process customer orders is given by the following rules:
(a) If a customer order is less than or equal to that in stock and has credit is OK, supply has requirement.
(b) If has credit is not OK do not supply. Send him intimation.
(c) If has credit is Ok but the item in stock is less than has order, supply what is in stock. Intimate to him data the balance will be shipped.
Write a C program to implement the company policy.

o<=s && c==ok --> supply
c!=ok         --> not supply 
s<=o          --> Availabale stock ordered And your Extra balance is credited


*/

import java.util.*;
class PolicyOfCmp
{
	public static void main(String args[])
	{
		int o,s=110;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Order= ");
		o=sc.nextInt();
		
		if (o<=s)
			System.out.println("Your Order Is supplyed");
		else if (s<=o)
			System.out.println("Availabale stock ordered And your Extra Amount is credited");
		else 
			System.out.println("Your Order Is Not supplyed");
		}
}