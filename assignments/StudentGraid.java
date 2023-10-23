package assignments;

import java.util.Scanner;

/*
The marks obtained by a student in 5 different subjects are input through the keyboard. The student gets a division as per the following rules:
Percentage above or equal to 60 - First division
Percentage between 50 and 59 - Second division
Percentage between 40 and 49 - Third division
Percentage less than 40 - Fail

if else lader
*/
public class StudentGraid {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Hindi Subject Marks");
		int Hindi = sc.nextInt();
		System.out.println("Enter Your Marathi Subject Marks");
		int Marathi = sc.nextInt();
		System.out.println("Enter Your English Subject Marks");
		int English = sc.nextInt();
		System.out.println("Enter Your Maths Subject Marks");
		int Maths = sc.nextInt();
		System.out.println("Enter Your Science Subject Marks");
		int Science = sc.nextInt();
		 
		System.out.println("Your 5 subject Mark are Hindi= "+ Hindi + ", Marathi= "+ Marathi +", English= "+ English + ", Maths= "+ Maths +", Science= "+ Science);
		
		double total = Hindi + Marathi + English + Maths + Science;
		
		double per = total/5;
		
		System.out.println("My Toatal Marks="+ total+ " And Percentage= "+per);
		
//		Percentage above or equal to 60 - First division
		 
		if(per<=100 && per >= 60)
			System.out.println("First Division");
		
//		Percentage between 50 and 59 - Second division
		else if(per >= 50 && per < 60)
			System.out.println("Second division");
		
//		Percentage between 40 and 49 - Third division
		
		else if(per >= 40 && per < 50)
			System.out.println("Third division");
		
//		Percentage less than 40 - Fail
		else if(per < 40 && per > 0)
			System.out.println("Fail");
		
		else
			System.out.println("Invalid Input");
	}

}
