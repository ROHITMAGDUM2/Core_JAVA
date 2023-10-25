package arrayprograms;

import java.util.Scanner;

public class ArrayIndexByUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of A ");
		int userDIndex= sc.nextInt();
		
		int[] a=new int[userDIndex];
		
		a[0]= 10;
		a[1]= 20;
		
		
		for(int i=0; i<=userDIndex-1; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
