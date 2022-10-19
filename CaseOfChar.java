

/*...Any character is entered through the keyboard, write a program to determine whether the character entered is a capital letter, a small case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various characters.

A – Z 65 – 90
a – z 97 – 122
0 – 9 48 – 57
special symbols 0 - 47, 58 - 64, 91 - 96, 123 - 127

...*/
package Java_Programs;
import java.util.*;
public class CaseOfChar 
{
	public static void main(String args[])
	{
		char Char1=0  ;
		int ascii=Char1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Any Character");
		Char1 =sc.next().charAt(0);
		
		if( (65<='A') && ('Z' <=90))
		{
			System.out.println("Character is UPPER Case");
		}
		else if( (97<= 'a')  && ('z' >=122) )
		{
			System.out.println("Character is Lower Case");
	
		}
		else if((48<= '0')  && ('9' >=57))
		{
			System.out.println("Character in Digit");
		}
		else
			System.out.println("It is Special Symbol");
	
}}



Output
Enter Quantity And Price Of itam

50
200
Your Total Amount is= 10000

