package ArrayList1;

import java.util.ArrayList;

public class _01_ConvertingStringIntoInteger {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		
		ArrayList<Integer> integerList = new ArrayList<>();
		
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		stringList.add("4");
		stringList.add("5");
		
		System.out.println(stringList);
		
		for (String str: stringList) {
			try
			{
				Integer intVlaue = Integer.parseInt(str);
						integerList.add(intVlaue);
	
			}catch(Exception e) {
				System.out.println(e);
			}
					
		}
		System.out.println(integerList);
	}
}
