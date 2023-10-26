package collectionCodes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(234);
		al.add(111);
		al.add(1, 222);
		al.add(123);
		al.add(al.size()/2,145);
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
	}
}
 