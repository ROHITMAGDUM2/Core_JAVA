import java.util.Scanner;

public class ArrayDemo1 {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length of array= ");
	a=sc.nextInt();
	int b= sc.nextInt();
	
	int[][]arr=new int[a][b];
	for(int i=0; i<=a;i++ ) {
		System.out.println(i);
		for (int j=0 ; j<=b;j++) {
			System.out.println(j);
		}
	}
}
}
