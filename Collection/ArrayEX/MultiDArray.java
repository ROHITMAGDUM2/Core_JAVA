package ArrayEX;

public class MultiDArray {

	public static void main(String[] args) {
		
		int[][] ar= new int[3][];
		ar[0]= new int[2];
		ar[1]= new int[3];
		ar[2]= new int[1];
		
		System.out.println(ar[2]);
		
		ar[0][0]= 111;
		ar[0][1]= 112;
		
		ar[1][0]=111;
		ar[1][1]=191;
		ar[1][2]=909;
		
		ar[2][0]=123;
		
		
		System.out.println(ar[1][1]);
	}

}
