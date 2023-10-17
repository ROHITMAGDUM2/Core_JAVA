package datatypesandvariables;

import java.util.Scanner;

public class VariablesProgrammingEx
{ 
static public void main(String []args)
{
	System.out.println("Hello, Here We Learn how variable works and uses of its, So Lets go......");
	
	int a; // variable declaration
	
	a=100;// variable initialization
		
	System.out.println(a);// variable printing

	float float1 = 1.9f;

		System.out.println("float1 = " + float1);// variable printing

	float float2 = 1.9F; // 1.9 = Double = 8 byte

		System.out.println("float2 = " + float2);// variable printing

	
		float  float3= (float)1.9; // 1.9 = Double = 8 byte

		System.out.println("float3 = " + float3);// variable printing

	
		double c =1.934534534;
		
		//double c =1.934534534D;
		
		//double c =1.934534534d;

		System.out.println("c = " + c);// variable printing

		char ch = '@';

		System.out.println("ch = " + ch);// variable printing

	
		boolean bl = true;

		System.out.println("bl = " + bl);// variable printing


		String s= "Pune";

		System.out.println("s = " + s);// variable printing

	
		String city = "Pune";
		String name = "Sumit";
		int age=22;
		String postion="Developer";

		System.out.println("Name = " + name);// variable printing
		System.out.println("Position = " + postion);

		//using Scanner to get User inputs 
		//integer inputs
		
		Scanner sc;
		
		sc= new Scanner(System.in);
		System.out.println("Enter any int value ");
		int p = sc.nextInt();
		
		System.out.println("p = "+p);
		
		System.out.println("Enter any int value ");
		
		int q = sc.nextInt();

		System.out.println("q = " + q);

	
		//Floating inputs
		System.out.println("Enter any float value ");
		
		
		float f1 = sc.nextFloat();

		System.out.println("f1 = " + f1);


		//Double inputs
		System.out.println("Enter any Double value ");
		
		//int p = sc.nextInt();
		
		//float f1 = sc.nextFloat();
		
		double d1 = sc.nextDouble();

		System.out.println("d1 = " + d1);
		
		
		//String inputs
		System.out.println("Enter any First String value ");		

		System.out.println("Enter any Second String value ");

		String s1 = sc.nextLine();
		String s2 = sc.next();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

	}

}
