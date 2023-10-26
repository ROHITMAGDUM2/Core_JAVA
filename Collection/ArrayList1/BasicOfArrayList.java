package ArrayList1;

import java.util.ArrayList;

public class BasicOfArrayList {
	
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(1, 30);
		list.add(2, 20);
		
		
		
		System.out.println(list);
	}

}
