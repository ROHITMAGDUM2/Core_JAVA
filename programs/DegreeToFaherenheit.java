package programs;

import java.util.Scanner;

public class DegreeToFaherenheit {

	public static void main(String[] args) {
		double f,c;
		System.out.println("Enter The Tempreture in Celsius: ");
		Scanner sc= new Scanner(System.in);
		c= sc.nextDouble();
		
		f= 9.0 / 5 * c + 32;
		System.out.println("Tempreture in Celsius =" + c);
		System.out.println("Temprature in Faherenheit ="+ f);
	}

}
/*
 * OutPut:
 * Enter The Tempreture in Celsius: 
 * 200
 * Tempreture in Celsius =200.0
 * emprature in Faherenheit =392.0
 *
 */