package collectionCodes;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
			
		ArrayList<Integer> al= new ArrayList<Integer>();
			
			System.out.println(al.size());
			
			al.add(111);
			al.add(234);
			al.add(123);
			
			
			System.out.println(al.size());
			
			System.out.println();
			
			al.add(1, 222);

		}

}
